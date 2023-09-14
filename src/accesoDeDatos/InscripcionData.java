package accesoDeDatos;

import entidades.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class InscripcionData {

  private Connection con = null;
  private MateriaData materiaData;
  private AlumnoData alumnoData;

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

  public List<Inscripcion> obtenerInscripciones() {
    String sql = "SELECT  idInscripcion, idAlumno, idMateria, nota FROM inscripcion";
    List<Inscripcion> inscripciones = new ArrayList<>();

    try {
      PreparedStatement ps = con.prepareStatement(sql);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
//        inscripcion.setMateria(alumnoData.buscarAlumno(rs.getInt("idAlumno")));
//        inscripcion.setMateria(materiaData.buscarMateria(rs.getInt("idMateria")));
        inscripcion.setNota(rs.getInt("nota"));

        inscripciones.add(inscripcion);

      }
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'inscripcion' ");
    }
    return inscripciones;
  }

  public List<Inscripcion> obtenerInscripcionesPorAlumno(int id) {
    String sql = "SELECT  idInscripcion, idAlumno, idMateria, nota FROM inscripcion WHERE idAlumno=?";
    List<Inscripcion> inscripciones = new ArrayList<>();

    try {
      PreparedStatement ps = con.prepareStatement(sql);
      ps.setInt(1, id);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
//        inscripcion.setMateria(alumnoData.buscarAlumno(rs.getInt("idAlumno")));
//        inscripcion.setMateria(materiaData.buscarMateria(rs.getInt("idMateria")));
        inscripcion.setNota(rs.getInt("nota"));

        inscripciones.add(inscripcion);

      }
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'inscripcion' ");
    }
    return inscripciones;
  }

  public List<Materia> obtenerMateriasCursadas(int id) {
    String sql = "SELECT m.idMateria, m.nombre, m.anio, m.estado FROM materia m "
            + "JOIN inscripcion i ON m.idMateria = i.idMateria "
            + "JOIN alumno a ON a.idAlumno = i.idAlumno "
            + "WHERE a.idAlumno = ?";
    List<Materia> materias = new ArrayList<>();

    try {
      PreparedStatement ps = con.prepareStatement(sql);
      ps.setInt(1, id);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        Materia materia = new Materia();
        materia.setIdMateria(rs.getInt("idMateria"));
        materia.setNombre(rs.getString("nombre"));
        materia.setAnioMateria(rs.getInt("anio"));
        materia.setEstado(rs.getBoolean("estado"));

        materias.add(materia);
      }
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al cargar las materias!");
    }
    return materias;
  }

  public List<Materia> obtenerNOMateriasCursadas(int id) {
    String sql = "SELECT m.idMateria, m.nombre, m.anio, m.estado FROM materia m "
            + "WHERE m.idMateria NOT IN ("
            + "SELECT i.idMateria "
            + "FROM inscripcion i "
            + "WHERE i.idAlumno = ?"
            + "); ";
    List<Materia> materias = new ArrayList<>();

    try {
      PreparedStatement ps = con.prepareStatement(sql);
      ps.setInt(1, id);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        Materia materia = new Materia();
        materia.setIdMateria(rs.getInt("idMateria"));
        materia.setNombre(rs.getString("nombre"));
        materia.setAnioMateria(rs.getInt("anio"));
        materia.setEstado(rs.getBoolean("estado"));

        materias.add(materia);
      }
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al cargar las materias!");
    }
    return materias;
  }

  public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
    String sql = "DELETE FROM `inscripcion` WHERE idAlumno=? and idMateria=?";

    try {
      PreparedStatement ps = con.prepareStatement(sql);
      ps.setInt(1, idAlumno);
      ps.setInt(2, idMateria);
      int exito = ps.executeUpdate();
      if (exito == 1) {
        JOptionPane.showMessageDialog(null, "Se elimino la inscripcion con exito!");
      }
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al eliminar la inscripcion!");
    }
  }

  public void actualizarNota(int idAlumno, int idMateria, int nota) {
    String sql = "UPDATE inscripcion SET nota=? WHERE idAlumno=? and idMateria=?";

    try {
      PreparedStatement ps = con.prepareStatement(sql);
      ps.setInt(1, nota);
      ps.setInt(2, idAlumno);
      ps.setInt(3, idMateria);
      int exito = ps.executeUpdate();

      if (exito == 1) {
        JOptionPane.showMessageDialog(null, "Nota actualizada!");
      }

    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "No se pudo actualizar la nota!");
    }
  }

  public List<Alumno> obtenerAlumnosXMateria(int idMateria) {
    String sql = "SELECT a.idAlumno, a.dni, a.nombre, a.apellido, a.fechaNacimiento, a.estado FROM alumno a "
            + "JOIN inscripcion i ON a.idAlumno = i.idAlumno "
            + "JOIN materia m ON m.idMateria = i.idMateria "
            + "WHERE m.idMateria = ?";
    List<Alumno> alumnos = new ArrayList<>();

    try {
      PreparedStatement ps = con.prepareStatement(sql);
      ps.setInt(1, idMateria);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        Alumno alumno = new Alumno();
        alumno.setIdAlumno(rs.getInt("idAlumno"));
        alumno.setDni(rs.getInt("dni"));
        alumno.setNombre(rs.getString("nombre"));
        alumno.setApellido(rs.getString("apellido"));
        alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
        alumno.setEstado(rs.getBoolean("estado"));

        alumnos.add(alumno);
      }
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al cargar las alumnos!");
    }
    return alumnos;
  }

}
