package entidades;

import accesoDeDatos.AlumnoData;
import java.time.LocalDate;

public class App {

  public static void main(String[] args) {
    Alumno juan = new Alumno(34568653, "Luna", "Pedro", LocalDate.of(1980, 4, 25), true);
    AlumnoData alu = new AlumnoData();
    alu.guardarAlumno(juan);

  }

}
