/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDeDatos;

import entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.management.Query.and;
import javax.swing.JOptionPane;

/**
 *
 * @author valef
 */
public class MateriaData {

    private Connection con = null;

    public MateriaData() {
        con = Conexion.getConnection(); // Se obtiene una conexión a la base de datos.
    }

    public void guardarMateria(Materia materia) {

        String sql = "INSERT INTO materia(nombre, anio, estado) VALUES(?,?,?)";

        try {

            /*
            La línea en cuestión crea un objeto PreparedStatement( ps) basado en la consulta SQL definida en sql y 
            configura la opción Statement.RETURN_GENERATED_KEYS para que se devuelvan las claves generadas 
            automáticamente después de ejecutar la consulta, lo que es útil si tienes una columna de clave primaria.
            autoincremental en tu tabla y necesitas obtener ese valor después de la inserción.
             */
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            // Se establecen los valores de los parámetros en la consulta SQL.
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isEstado());

            ps.execute(); // Se ejecuta la consulta SQL para insertar la materia en la base de datos.

            ResultSet rs = ps.getGeneratedKeys(); // Se obtienen las claves generadas automáticamente.

            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1)); // Se obtiene y establece la clave generada en el objeto Materia.
                JOptionPane.showMessageDialog(null, "Materia guardada"); // Se muestra un mensaje de éxito.
            }

            ps.close(); // Se cierra la declaración preparada para liberar recursos.

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la materia"); // En caso de error, se muestra un mensaje de error.
        }
    }

    //******************************************************************************************************************
    public void modificarMateria(Materia materia) {

        String sql = "UPDATE materia SET nombre=?, anio=? Where IDMateria=? ";
        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setInt(3, materia.getIdMateria());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia modificada");
            }
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la Materia ");
        }

    }
    //******************************************************************************************************************

    public void eliminarMateria(int id) {

        String sql = "update materia SET estado =0 WHERE idMateria=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia eliminada");

            }
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "No se pudo ingresar a Materia ");
        }
    }

    //**************************************************************************************************************
    public Materia buscarMateria(int id) {

        String sql = "SELECT nombre , anio ,estado FROM materia WHERE idMateria = ? AND estado=1";

        Materia materia = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                materia = new Materia();

                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anio"));
                materia.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "No existe esa Materia ");

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Materia ");
        }
        return materia;
    }

    //***************************************************************************************************************
    //      LISTAR  
    public  List<Materia> listarMateria() {

        String sql = "SELECT  idMateria ,nombre , anio ,estado FROM materia WHERE  estado=1";
        ArrayList<Materia> materias = new ArrayList<>();

        try {
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {

                    Materia materia = new Materia();

                    materia.setIdMateria(rs.getInt("idMateria"));
                    materia.setNombre(rs.getString("nombre"));
                    materia.setAnioMateria(rs.getInt("anio"));
                    materia.setEstado(true);

                    materias.add(materia);

                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a Materia ");

        }
        return materias;
    }

    //*************************************************************************
    //      materias repetidas
    public List<Materia> buscarMateriasDuplicadas() {
        String sql = "SELECT nombre, anio FROM materia WHERE nombre=? AND anio = ?";
        ArrayList<Materia> materiasDuplicadas = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Materia materia = new Materia();
            while (rs.next()) {
              
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anio"));
                materiasDuplicadas.add(materia);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar materias duplicadas...");
        }
        return materiasDuplicadas;
    }

}
