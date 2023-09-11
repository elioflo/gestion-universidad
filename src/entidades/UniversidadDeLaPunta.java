/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import accesoDeDatos.AlumnoData;
import java.sql.Connection;
import accesoDeDatos.Conexion;
import java.time.LocalDate;

/**
 *
 * @author valef
 */
public class UniversidadDeLaPunta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //Connection con = Conexion.getConnection();
       Alumno juan=new Alumno (34568653,"Luna","Pedro",LocalDate.of(1980, 4, 25),true);
        AlumnoData alu=new AlumnoData();
        //alu.guardarAlumno(juan);
        
       
    }
    
}
