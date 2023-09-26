/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import accesoDeDatos.*;
import java.sql.Connection;

/**
 *
 * @author lucap
 */
public class PanelPrincipal extends javax.swing.JFrame {

  private final InscripcionData inscripcionData;
  private final MateriaData materiaData;
  private final AlumnoData alumnoData;

  /**
   * Creates new form PanelPrincipal
   */
  public PanelPrincipal() {
    Connection con = Conexion.getConnection();
    if (con != null) {
      initComponents();
      setLocationRelativeTo(null);
    } else {
      System.exit(0);
    }
    inscripcionData = new InscripcionData();
    materiaData = new MateriaData();
    alumnoData = new AlumnoData();
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Alumno_menu = new javax.swing.JMenu();
        Alumno_formularioAlumno = new javax.swing.JMenuItem();
        Materia_menu = new javax.swing.JMenu();
        Materia_formularioMateria = new javax.swing.JMenuItem();
        Admin_menu = new javax.swing.JMenu();
        Admin_manejoInscripciones = new javax.swing.JMenuItem();
        Admin_manipulacionNotas = new javax.swing.JMenuItem();
        Consultas_menu = new javax.swing.JMenu();
        Consultas_alumnosMateria = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );

        Alumno_menu.setText("Alumno");
        Alumno_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Alumno_formularioAlumno.setText("Formulario de alumno");
        Alumno_formularioAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Alumno_formularioAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alumno_formularioAlumnoActionPerformed(evt);
            }
        });
        Alumno_menu.add(Alumno_formularioAlumno);

        jMenuBar1.add(Alumno_menu);

        Materia_menu.setText("Materia");
        Materia_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Materia_formularioMateria.setText("Formulario de materia");
        Materia_formularioMateria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Materia_formularioMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Materia_formularioMateriaActionPerformed(evt);
            }
        });
        Materia_menu.add(Materia_formularioMateria);

        jMenuBar1.add(Materia_menu);

        Admin_menu.setText("Administración");
        Admin_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Admin_manejoInscripciones.setText("Manejo de inscripciones");
        Admin_manejoInscripciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Admin_manejoInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_manejoInscripcionesActionPerformed(evt);
            }
        });
        Admin_menu.add(Admin_manejoInscripciones);

        Admin_manipulacionNotas.setText("Manipulación de notas");
        Admin_manipulacionNotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Admin_manipulacionNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_manipulacionNotasActionPerformed(evt);
            }
        });
        Admin_menu.add(Admin_manipulacionNotas);

        jMenuBar1.add(Admin_menu);

        Consultas_menu.setText("Consultas");
        Consultas_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Consultas_alumnosMateria.setText("Alumnos por materia");
        Consultas_alumnosMateria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Consultas_alumnosMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consultas_alumnosMateriaActionPerformed(evt);
            }
        });
        Consultas_menu.add(Consultas_alumnosMateria);

        jMenuBar1.add(Consultas_menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Alumno_formularioAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alumno_formularioAlumnoActionPerformed
    escritorio.removeAll();
    escritorio.repaint();
    FormularioAlumno form = new FormularioAlumno();
    form.setVisible(true);
    escritorio.add(form);
    }//GEN-LAST:event_Alumno_formularioAlumnoActionPerformed

    private void Materia_formularioMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Materia_formularioMateriaActionPerformed
    escritorio.removeAll();
    escritorio.repaint();
    FormularioMateria form = new FormularioMateria();
    form.setVisible(true);
    escritorio.add(form);
    }//GEN-LAST:event_Materia_formularioMateriaActionPerformed

    private void Admin_manejoInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_manejoInscripcionesActionPerformed
    escritorio.removeAll();
    escritorio.repaint();
    ManejoInscripciones form = new ManejoInscripciones(inscripcionData, materiaData, alumnoData);
    form.setVisible(true);
    escritorio.add(form);
    }//GEN-LAST:event_Admin_manejoInscripcionesActionPerformed

    private void Admin_manipulacionNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_manipulacionNotasActionPerformed
    escritorio.removeAll();
    escritorio.repaint();
    ManipulacionNotas form = new ManipulacionNotas(inscripcionData);
    form.setVisible(true);
    escritorio.add(form);  //*************************************************************************************************/
    }//GEN-LAST:event_Admin_manipulacionNotasActionPerformed

    private void Consultas_alumnosMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consultas_alumnosMateriaActionPerformed
    escritorio.removeAll();
    escritorio.repaint();
    AlumnosXMateria form = new AlumnosXMateria();
    form.setVisible(true);
    escritorio.add(form);
    }//GEN-LAST:event_Consultas_alumnosMateriaActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new PanelPrincipal().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Admin_manejoInscripciones;
    private javax.swing.JMenuItem Admin_manipulacionNotas;
    private javax.swing.JMenu Admin_menu;
    private javax.swing.JMenuItem Alumno_formularioAlumno;
    private javax.swing.JMenu Alumno_menu;
    private javax.swing.JMenuItem Consultas_alumnosMateria;
    private javax.swing.JMenu Consultas_menu;
    private javax.swing.JMenuItem Materia_formularioMateria;
    private javax.swing.JMenu Materia_menu;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
