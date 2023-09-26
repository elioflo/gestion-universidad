
package vistas;

import accesoDeDatos.AlumnoData;
import accesoDeDatos.InscripcionData;
import accesoDeDatos.MateriaData;
import entidades.Alumno;
import entidades.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;


public class AlumnosXMateria extends javax.swing.JInternalFrame {

   private DefaultTableModel modelo = new DefaultTableModel(){
   
   public boolean isCellEditable(int fila,int columna){
   
   return false;
   }
   
   };
   
   
    public AlumnosXMateria() {
        initComponents();
        armarCabecera();
        initButtons();
        llenarTabla();
    }
   

    @SuppressWarnings("unchecked")
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jCbMaterias = new javax.swing.JComboBox<>();
        jLElijaMateria = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlumnos = new javax.swing.JTable();
        jLListadoDeAlumno = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setClosable(true);

        jCbMaterias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCbMateriasItemStateChanged(evt);
            }
        });
        jCbMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbMateriasActionPerformed(evt);
            }
        });

        jLElijaMateria.setText("Seleccione una Materia");

        jTableAlumnos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableAlumnos);

        jLListadoDeAlumno.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLListadoDeAlumno.setText("Listado de alumnos por Materia");

        jBSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLListadoDeAlumno)))
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLElijaMateria)
                        .addGap(53, 53, 53)
                        .addComponent(jCbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalir))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLListadoDeAlumno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLElijaMateria)
                    .addComponent(jCbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBSalir)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCbMateriasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCbMateriasItemStateChanged
    // initButtons();
     llenarTabla();
     
     //if()
//    radioButtons.clearSelection();
//    limpiarTabla();
    }//GEN-LAST:event_jCbMateriasItemStateChanged

    private void jCbMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbMateriasActionPerformed
        
    
    }//GEN-LAST:event_jCbMateriasActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
         this.dispose();
        
    }//GEN-LAST:event_jBSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<entidades.Materia> jCbMaterias;
    private javax.swing.JLabel jLElijaMateria;
    private javax.swing.JLabel jLListadoDeAlumno;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableAlumnos;
    // End of variables declaration//GEN-END:variables
private void armarCabecera(){
     modelo.addColumn("IdAlumno");
     modelo.addColumn("DNI");
     modelo.addColumn("Apellido");
     modelo.addColumn("Nombre");
     jTableAlumnos.setModel(modelo);


}
private void initButtons() {
    // Crear una instancia de MateriaData
    MateriaData materiaData = new MateriaData();
    
    // Llamar al método listarMateria para obtener la lista de materias
    List<Materia> materias = materiaData.listarMateria();
    
    DefaultComboBoxModel<Materia> comboBoxModel = new DefaultComboBoxModel<>();

    // 3. Agregar las materias al modelo de datos del JComboBox
    for (Materia materia : materias) {
        comboBoxModel.addElement(materia);
    }

    // 4. Asignar el modelo de datos al JComboBox
    jCbMaterias.setModel(comboBoxModel);
  
}
  private void llenarTabla() {  
    Materia materia = (Materia)jCbMaterias.getSelectedItem();
    InscripcionData inscripcion = new InscripcionData();
    List<Alumno> listaAlumno = inscripcion.obtenerAlumnosXMateria(materia.getIdMateria());
      limpiarTabla();
      for(Alumno alum :listaAlumno){
      
       modelo.addRow(new Object[]{alum.getIdAlumno(),alum.getDni(),alum.getApellido(),alum.getNombre()});
      }  
  }

  private void limpiarTabla() {
    modelo.setRowCount(0);
  }


}