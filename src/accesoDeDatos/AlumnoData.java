/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDeDatos;

import entidades.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableColumnModel;


public class AlumnoData {
    
    private Connection con=null;

    public AlumnoData() {
        //nosotros lo tenemos escrito asi el metodo getConnection(); en la clase Conexion 
       con=Conexion.getConnection();
       
        
    }
    
    public void guardarAlumno(Alumno alumno){
        
        String sql="INSERT INTO alumno (dni,apellido,nombre,FechaNacimiento,estado)"
                + "VALUES (?,?,?,?,?)";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            //agregue el atributo dn que faltaba en la clase alumno del paquete entidades
            ps.setInt(1,alumno.getDni());
            ps.setString(2,alumno.getApellido());
            ps.setString(3,alumno.getNombre());
            ps.setDate(4,Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5,alumno.getEstado()); 
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            
            if(rs.next()){
            
             alumno.setIdAlumno(rs.getInt(1));
             JOptionPane.showMessageDialog(null, "Alumno agregado correctamente");
            }
            
            ps.close();
            
            
        } catch (SQLException ex) {
           
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Alumno");
        }
    }
    
    
    public void modificarAlumno(Alumno alumno){
        
        String sql = "UPDATE alumno SET dni=?, apellido=?, nombre=?, FechaNacimiento=? WHERE idAlumno=?";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2,alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setInt(5,alumno.getIdAlumno());
            int exito = ps.executeUpdate();
            
            if (exito==1) {
                JOptionPane.showMessageDialog(null, "Alumno modificado correctamente");
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno");
           
        }
    }
    public void borrarAlumno(int dni){
        try {
            String sql = "DELETE FROM alumno WHERE dni=? ";
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, dni);
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Alumno eliminado");
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno"); 
        }
        
    }
    public Alumno buscarAlumno(int id) {
        Alumno alumno = null;
        String sql = "SELECT dni,apellido,nombre,FechaNacimiento FROM alumno WHERE idAlumno = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("FechaNacimiento").toLocalDate());
                alumno.setEstado(true);

            } else {

                JOptionPane.showMessageDialog(null, "No se encontró al alumno");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno");
        }

        return alumno;
    }

    public Alumno buscarAlumnoPorDni(int dni) {
        Alumno alumno = null;
        String sql = "SELECT  idAlumno,dni,apellido,nombre,FechaNacimiento,estado FROM alumno WHERE dni =?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("FechaNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "No se encontró a un alumno con el DNI ingresado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ya existe un alumno con el DNI ingresado");
        }

        return alumno;

    }
    public List<Alumno> listarAlumnos() {

        List<Alumno> alumnos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM alumno WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumno = new Alumno();

                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
                alumnos.add(alumno);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno " + ex.getMessage());
        }
        return alumnos;
    }


}