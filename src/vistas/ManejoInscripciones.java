/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import accesoDeDatos.*;
import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.awt.event.ItemEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucap
 */
public class ManejoInscripciones extends javax.swing.JInternalFrame {

  private final DefaultTableModel model = new DefaultTableModel() {
    @Override
    public boolean isCellEditable(int row, int column) {
      return false;
    }
  };
  private final InscripcionData inscripcionData;
  private final MateriaData materiaData;
  private final AlumnoData alumnoData;

  /**
   * Creates new form ManejoInscripciones
   *
   * @param inscripcionData
   * @param materiaData
   * @param alumnoData
   */
  public ManejoInscripciones(InscripcionData inscripcionData, MateriaData materiaData, AlumnoData alumnoData) {
    this.inscripcionData = inscripcionData;
    this.materiaData = materiaData;
    this.alumnoData = alumnoData;
    initComponents();
    initTabla();
    initButtons();
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    radioButtons = new javax.swing.ButtonGroup();
    formularioDeInscripcion = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    jSeparator1 = new javax.swing.JSeparator();
    jLabel1 = new javax.swing.JLabel();
    alumnos = new javax.swing.JComboBox<>();
    listadoDeMaterias = new javax.swing.JPanel();
    titulo = new javax.swing.JLabel();
    jRadioButton1 = new javax.swing.JRadioButton();
    jRadioButton2 = new javax.swing.JRadioButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    tabla = new javax.swing.JTable();
    botones = new javax.swing.JPanel();
    inscribirBtn = new javax.swing.JButton();
    filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
    anularBtn = new javax.swing.JButton();
    filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
    jButton3 = new javax.swing.JButton();

    setClosable(true);

    jLabel2.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setText("Formulario de Inscripción");

    jLabel1.setText("Seleccione un alumno:");

    alumnos.setModel(new javax.swing.DefaultComboBoxModel<>(alumnoData.listarAlumnos().toArray(new entidades.Alumno[0])));
    alumnos.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        alumnosItemStateChanged(evt);
      }
    });

    javax.swing.GroupLayout formularioDeInscripcionLayout = new javax.swing.GroupLayout(formularioDeInscripcion);
    formularioDeInscripcion.setLayout(formularioDeInscripcionLayout);
    formularioDeInscripcionLayout.setHorizontalGroup(
      formularioDeInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(formularioDeInscripcionLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(formularioDeInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(formularioDeInscripcionLayout.createSequentialGroup()
            .addGap(0, 64, Short.MAX_VALUE)
            .addComponent(jLabel2)
            .addGap(0, 64, Short.MAX_VALUE))
          .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(formularioDeInscripcionLayout.createSequentialGroup()
            .addGap(25, 25, 25)
            .addComponent(jLabel1)
            .addGap(58, 58, 58)
            .addComponent(alumnos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(25, 25, 25)))
        .addContainerGap())
    );
    formularioDeInscripcionLayout.setVerticalGroup(
      formularioDeInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(formularioDeInscripcionLayout.createSequentialGroup()
        .addGap(9, 9, 9)
        .addComponent(jLabel2)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(formularioDeInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    titulo.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
    titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    titulo.setText("Listado de Materias");

    radioButtons.add(jRadioButton1);
    jRadioButton1.setText("Materias inscriptas");
    jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        listarMateriasInscriptas(evt);
      }
    });

    radioButtons.add(jRadioButton2);
    jRadioButton2.setText("Materias no inscriptas");
    jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        listarMateriasNoInscriptas(evt);
      }
    });

    tabla.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Title 1", "Title 2", "Title 3", "Title 4"
      }
    ));
    jScrollPane1.setViewportView(tabla);

    botones.setLayout(new javax.swing.BoxLayout(botones, javax.swing.BoxLayout.LINE_AXIS));

    inscribirBtn.setText("Inscribir");
    inscribirBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        inscribirBtnActionPerformed(evt);
      }
    });
    botones.add(inscribirBtn);
    botones.add(filler1);

    anularBtn.setText("Anular Inscripcion");
    anularBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        anularBtnActionPerformed(evt);
      }
    });
    botones.add(anularBtn);
    botones.add(filler2);

    jButton3.setText("Salir");
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton3ActionPerformed(evt);
      }
    });
    botones.add(jButton3);

    javax.swing.GroupLayout listadoDeMateriasLayout = new javax.swing.GroupLayout(listadoDeMaterias);
    listadoDeMaterias.setLayout(listadoDeMateriasLayout);
    listadoDeMateriasLayout.setHorizontalGroup(
      listadoDeMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listadoDeMateriasLayout.createSequentialGroup()
        .addGroup(listadoDeMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(listadoDeMateriasLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(titulo)
            .addGap(0, 0, Short.MAX_VALUE))
          .addGroup(listadoDeMateriasLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(listadoDeMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(listadoDeMateriasLayout.createSequentialGroup()
                .addComponent(jRadioButton1)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jRadioButton2))
              .addGroup(listadoDeMateriasLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
              .addComponent(botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        .addContainerGap())
    );
    listadoDeMateriasLayout.setVerticalGroup(
      listadoDeMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(listadoDeMateriasLayout.createSequentialGroup()
        .addGap(10, 10, 10)
        .addComponent(titulo)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(listadoDeMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jRadioButton1)
          .addComponent(jRadioButton2))
        .addGap(18, 18, 18)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(formularioDeInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(listadoDeMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(formularioDeInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(listadoDeMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void inscribirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscribirBtnActionPerformed
    int fila = tabla.getSelectedRow();
    if (fila > -1) {
      Inscripcion inscripcion = new Inscripcion();
      inscripcion.setAlumno(alumnoSeleccionado());
      inscripcion.setMateria(materiaSeleccionada());
      inscripcionData.guardarInscripcion(inscripcion);
      model.removeRow(fila);
    } else {
      JOptionPane.showMessageDialog(null, "Seleccione una materia!");
    }
  }//GEN-LAST:event_inscribirBtnActionPerformed

  private void listarMateriasInscriptas(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listarMateriasInscriptas
    if (evt.getStateChange() == ItemEvent.SELECTED) {
      llenarTabla(materiasInscriptas());
      inscribirBtn.setEnabled(false);
      anularBtn.setEnabled(true);
    }
  }//GEN-LAST:event_listarMateriasInscriptas

  private void listarMateriasNoInscriptas(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listarMateriasNoInscriptas
    if (evt.getStateChange() == ItemEvent.SELECTED) {
      llenarTabla(materiasNoInscriptas());
      inscribirBtn.setEnabled(true);
      anularBtn.setEnabled(false);
    }
  }//GEN-LAST:event_listarMateriasNoInscriptas

  private void alumnosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_alumnosItemStateChanged
    initButtons();
    radioButtons.clearSelection();
    limpiarTabla();
  }//GEN-LAST:event_alumnosItemStateChanged

  private void anularBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anularBtnActionPerformed
    int fila = tabla.getSelectedRow();
    if (fila > -1) {
      borrarInscripcion();
      model.removeRow(fila);
    } else {
      JOptionPane.showMessageDialog(null, "Seleccione una materia!");
    }
  }//GEN-LAST:event_anularBtnActionPerformed

  private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    this.dispose();
  }//GEN-LAST:event_jButton3ActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox<entidades.Alumno> alumnos;
  private javax.swing.JButton anularBtn;
  private javax.swing.JPanel botones;
  private javax.swing.Box.Filler filler1;
  private javax.swing.Box.Filler filler2;
  private javax.swing.JPanel formularioDeInscripcion;
  private javax.swing.JButton inscribirBtn;
  private javax.swing.JButton jButton3;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JRadioButton jRadioButton1;
  private javax.swing.JRadioButton jRadioButton2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JPanel listadoDeMaterias;
  private javax.swing.ButtonGroup radioButtons;
  private javax.swing.JTable tabla;
  private javax.swing.JLabel titulo;
  // End of variables declaration//GEN-END:variables

  private void llenarTabla(List<Materia> materias) {
    limpiarTabla();
    materias.forEach(materia -> model.addRow(materia.getData()));
  }

  private void limpiarTabla() {
    model.setRowCount(0);
  }

  private void initTabla() {
    model.addColumn("ID");
    model.addColumn("Nombre");
    model.addColumn("Año");
    tabla.setModel(model);
  }

  private void initButtons() {
    inscribirBtn.setEnabled(false);
    anularBtn.setEnabled(false);
  }

  private Alumno alumnoSeleccionado() {
    return alumnos.getItemAt(alumnos.getSelectedIndex());
  }

  private Materia materiaSeleccionada() {
    return materiaData.buscarMateria(getIdMateria());
  }

  private List<Materia> materiasInscriptas() {
    return inscripcionData.obtenerMateriasCursadas(alumnoSeleccionado().getIdAlumno());
  }

  private List<Materia> materiasNoInscriptas() {
    return inscripcionData.obtenerNOMateriasCursadas(alumnoSeleccionado().getIdAlumno());
  }

  private void borrarInscripcion() {
    inscripcionData.borrarInscripcionMateriaAlumno(alumnoSeleccionado().getIdAlumno(), getIdMateria());
  }

  private int getIdMateria() {
    return (Integer) tabla.getValueAt(tabla.getSelectedRow(), 0);
  }
}
