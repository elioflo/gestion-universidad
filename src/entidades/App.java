package entidades;

import accesoDeDatos.InscripcionData;
import java.util.List;

public class App {

  public static void main(String[] args) {
//    Alumno juan = new Alumno(34568653, "Luna", "Pedro", LocalDate.of(1980, 4, 25), true);
//    AlumnoData alu = new AlumnoData();
//    alu.guardarAlumno(juan);

    InscripcionData inscripcionData = new InscripcionData();
    List<Inscripcion> inscripciones = inscripcionData.obtenerInscripciones();
    inscripciones.forEach(inscripcion -> System.out.println(inscripcion.getIdInscripcion() + ":" + inscripcion.getNota()));
  }
  
}
