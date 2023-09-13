/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import accesoDeDatos.AlumnoData;
import entidades.Alumno;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author lucap
 */
public class FormularioAlumno extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormularioAlumno
     */
    public FormularioAlumno() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        documento_text = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        apellido_text = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nombre_text = new javax.swing.JTextField();
        lupa = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        estado_boton = new javax.swing.JRadioButton();
        nuevoAlumno_boton = new javax.swing.JButton();
        eliminar_boton = new javax.swing.JButton();
        modificar_boton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        fecha_chooser = new com.toedter.calendar.JDateChooser();
        limpiar_boton = new javax.swing.JButton();

        setClosable(true);
        setTitle("Alumnos");

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Información de los alumnos");

        jLabel2.setText("Documento:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Nombre:");

        nombre_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_textActionPerformed(evt);
            }
        });

        lupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libreria/107122.png"))); // NOI18N
        lupa.setBorderPainted(false);
        lupa.setContentAreaFilled(false);
        lupa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lupa.setMaximumSize(new java.awt.Dimension(546, 522));
        lupa.setMinimumSize(new java.awt.Dimension(546, 522));
        lupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lupaActionPerformed(evt);
            }
        });

        jLabel5.setText("Estado:");

        estado_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado_botonActionPerformed(evt);
            }
        });

        nuevoAlumno_boton.setText("Nuevo alumno");
        nuevoAlumno_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoAlumno_botonActionPerformed(evt);
            }
        });

        eliminar_boton.setText("Eliminar");
        eliminar_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_botonActionPerformed(evt);
            }
        });

        modificar_boton.setText("Modificar");
        modificar_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_botonActionPerformed(evt);
            }
        });

        jLabel6.setText("Fecha:");

        limpiar_boton.setText("Limpiar");
        limpiar_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar_botonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estado_boton)
                            .addComponent(fecha_chooser, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(documento_text, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lupa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(apellido_text)
                                .addComponent(nombre_text)))
                        .addGap(50, 50, 50))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(nuevoAlumno_boton)
                        .addGap(18, 18, 18)
                        .addComponent(eliminar_boton)
                        .addGap(18, 18, 18)
                        .addComponent(modificar_boton)
                        .addGap(18, 18, 18)
                        .addComponent(limpiar_boton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(documento_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lupa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellido_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(estado_boton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(fecha_chooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevoAlumno_boton)
                    .addComponent(eliminar_boton)
                    .addComponent(modificar_boton)
                    .addComponent(limpiar_boton))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombre_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_textActionPerformed

    private void lupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lupaActionPerformed
        AlumnoData data = new AlumnoData();
        if (data.buscarAlumnoPorDni(Integer.parseInt(documento_text.getText()))!=null){
            try {
                Long lo = Long.parseLong(documento_text.getText());
                
                Alumno alumno = data.buscarAlumnoPorDni(Integer.parseInt(documento_text.getText()));
                apellido_text.setText(alumno.getApellido());
                nombre_text.setText(alumno.getNombre());            
                estado_boton.setSelected(alumno.getEstado());
                fecha_chooser.setDate(convertirLocalDate(alumno.getFechaNacimiento()));
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "El número de documento es inválido");
            }
        }
        
    }//GEN-LAST:event_lupaActionPerformed

    private void estado_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado_botonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estado_botonActionPerformed

    private void eliminar_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_botonActionPerformed
        AlumnoData data = new AlumnoData();
        if (data.buscarAlumnoPorDni(Integer.parseInt(documento_text.getText()))!=null){
             try {
                 Long lo = Long.parseLong(documento_text.getText());
                
                 int boole = JOptionPane.showConfirmDialog(null, "¿Estas seguro de eliminar este alumno?");
                 if(boole==0){
                        new AlumnoData().borrarAlumno(Integer.parseInt(documento_text.getText()));
                  }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "El número de documento es inválido");
            }
        }
    }//GEN-LAST:event_eliminar_botonActionPerformed

    private void modificar_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_botonActionPerformed
           if (chequeoExcepciones()){
            Alumno alumn = new Alumno(Integer.parseInt(documento_text.getText()), apellido_text.getText(), nombre_text.getText(), convertirDate(fecha_chooser.getDate()), estado_boton.isSelected());
            new AlumnoData().modificarAlumno(alumn);
        }
    }//GEN-LAST:event_modificar_botonActionPerformed

    private void nuevoAlumno_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoAlumno_botonActionPerformed
        if (chequeoExcepciones()){
            Alumno alumn = new Alumno(Integer.parseInt(documento_text.getText()), apellido_text.getText(), nombre_text.getText(), convertirDate(fecha_chooser.getDate()), estado_boton.isSelected());
            int boole = JOptionPane.showConfirmDialog(null, "¿Desea agregar este alumno?");
                 if(boole==0){
                        new AlumnoData().guardarAlumno(alumn);
                   }
        }
    }//GEN-LAST:event_nuevoAlumno_botonActionPerformed

    private void limpiar_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar_botonActionPerformed
        documento_text.setText("");
        apellido_text.setText("");
        nombre_text.setText("");            
        estado_boton.setSelected(false);
        fecha_chooser.setDate(null);
    }//GEN-LAST:event_limpiar_botonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido_text;
    private javax.swing.JTextField documento_text;
    private javax.swing.JButton eliminar_boton;
    private javax.swing.JRadioButton estado_boton;
    private com.toedter.calendar.JDateChooser fecha_chooser;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton limpiar_boton;
    private javax.swing.JButton lupa;
    private javax.swing.JButton modificar_boton;
    private javax.swing.JTextField nombre_text;
    private javax.swing.JButton nuevoAlumno_boton;
    // End of variables declaration//GEN-END:variables

    private boolean chequeoExcepciones(){
        try{
            Long lo = Long.parseLong(documento_text.getText());
            chequeoTexto(nombre_text);
            chequeoTexto(apellido_text);
            
            return true;
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "El número de documento no es válido");
            return false;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "El nombre o el apellido no son válidos");
            return false;
        }
    }
    
    private void chequeoTexto(JTextField txt){
        for (int i = 0; i < txt.getText().length() ; i++) {
                char aux = txt.getText().charAt(i);
                if (aux=='0' || aux=='1' || aux=='2' || aux=='3' || aux=='4' || aux=='5' || aux=='6' || aux=='7' || aux=='8' || aux=='9' || aux==',' || aux=='.' || aux=='-' || aux=='_' || aux==';' || aux==':' || aux=='!' || aux=='"' || aux=='#' || aux=='$' || aux=='%' || aux=='&' || aux=='/' || aux=='(' || aux==')' || aux=='=' || aux=='?' || aux=='¡' || aux=='¿'){
                    int num = 10/0;
                }
            }
    }
    
    public LocalDate convertirDate(Date dateToConvert) {
    return dateToConvert.toInstant()
      .atZone(ZoneId.systemDefault())
      .toLocalDate();
    }
    
    public Date convertirLocalDate(LocalDate dateToConvert) {
    return java.util.Date.from(dateToConvert.atStartOfDay()
      .atZone(ZoneId.systemDefault())
      .toInstant());
}
}
