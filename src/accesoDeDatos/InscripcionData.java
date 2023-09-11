package accesoDeDatos;

import entidades.Inscripcion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class InscripcionData {

  private Connection con = null;

  public InscripcionData() {
    con = Conexion.getConnection();
  }

  public void guardarInscripcion(Inscripcion inscripcion) {
    String sql = "INSERT INTO inscripcion (nota,idAlumno,idMateria) VALUES (?,?,?)";

    try {
      PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
      ps.setInt(1, inscripcion.getNota());
      ps.setInt(2, inscripcion.getAlumno().getIdAlumno());
      ps.setInt(3, inscripcion.getMateria().getIdMateria());
      ps.executeUpdate();

      ResultSet rs = ps.getGeneratedKeys();

      if (rs.next()) {
        inscripcion.setIdInscripcion(rs.getInt(1));
        JOptionPane.showMessageDialog(null, "inscripcion agregada correctamente");
      }
      ps.close();

    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'inscripcion'");
    }
  }

  public void modificarInscripcion(Inscripcion inscripcion) {
    String sql = "UPDATE inscripcion SET nota=?, idAlumno=?, idMateria=? WHERE idInscripcion=?";

    try {
      PreparedStatement ps = con.prepareStatement(sql);
      ps.setInt(1, inscripcion.getNota());
      ps.setInt(2, inscripcion.getAlumno().getIdAlumno());
      ps.setInt(3, inscripcion.getMateria().getIdMateria());
      ps.setInt(4, inscripcion.getIdInscripcion());
      int exito = ps.executeUpdate();

      if (exito == 1) {
        JOptionPane.showMessageDialog(null, "inscripcion modificado");
      }

    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'inscripcion'");

    }
  }

  public void borrarInscripcion(int id) {
    String sql = "DELETE FROM `inscripcion` WHERE idInscripcion=?";

    try {
      PreparedStatement ps = con.prepareStatement(sql);
      ps.setInt(1, id);
      int exito = ps.executeUpdate();
      if (exito == 1) {
        JOptionPane.showMessageDialog(null, "inscripcion eliminada");
      }
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'inscripcion'");
    }

  }

}
