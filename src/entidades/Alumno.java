/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.time.LocalDate;

/**
 *
 * @author valef
 */
public class Alumno {
  private int idAlumno;
  private String apellido, nombre;
  private LocalDate fechaNacimiento;
 private boolean estado;

    public Alumno() {
    }

    public Alumno(int idAlumno, String apellido, String nombre, LocalDate fechaNacimiento, boolean estado) {
        this.idAlumno = idAlumno;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }

    public Alumno(String apellido, String nombre, LocalDate fechaNacimiento, boolean estado) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", apellido=" + apellido + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", estado=" + estado + '}';
    }
   
 
}
 
