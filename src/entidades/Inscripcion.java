/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author valef
 */
public class Inscripcion {

  private int idInscripcion;
  private Alumno alumno;
  private Materia materia;
  private int nota;

  public Inscripcion() {
  }

  public Inscripcion(int idInscripcion, Alumno alumno, Materia materia, int nota) {
    this.idInscripcion = idInscripcion;
    this.alumno = alumno;
    this.materia = materia;
    this.nota = nota;
  }

  public Inscripcion(Alumno alumno, Materia materia, int nota) {
    this.alumno = alumno;
    this.materia = materia;
    this.nota = nota;
  }

  public int getIdInscripcion() {
    return idInscripcion;
  }

  public void setIdInscripcion(int idInscripcion) {
    this.idInscripcion = idInscripcion;
  }

  public Alumno getAlumno() {
    return alumno;
  }

  public void setAlumno(Alumno alumno) {
    this.alumno = alumno;
  }

  public Materia getMateria() {
    return materia;
  }

  public void setMateria(Materia materia) {
    this.materia = materia;
  }

  public int getNota() {
    return nota;
  }

  public void setNota(int nota) {
    this.nota = nota;
  }

  @Override
  public String toString() {
    String insc = idInscripcion + " " + alumno.getNombre() + " " + alumno.getApellido() + "" + materia.getNombre();
    return insc;
  }

  public Object[] getData() {
    System.out.println(materia.getIdMateria());
    System.out.println(materia.getNombre());
    return new Object[]{materia.getIdMateria(), materia.getNombre(), nota};
  }

}
