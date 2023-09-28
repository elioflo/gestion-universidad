/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import accesoDeDatos.MateriaData;
import entidades.Materia;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author lucap
 */
public class FormularioMateria extends javax.swing.JInternalFrame {

    private javax.swing.JLabel jlTitulo;
    private boolean estado;
    private boolean isEditando;

    /**
     * Creates new form FormularioMateria
     */
    public FormularioMateria() {
        initComponents();
        jTConsulta.setEditable(true);
        jTextFieldNombre.setEditable(false);
        jTextFieldAnio.setEditable(false);
        jTextIdVista.setEditable(false);
        jRadioButtonEstado.setEnabled(false);
    }

       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLlisAlumno = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldAnio = new javax.swing.JTextField();
        jLTitulo = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jButtonNuevo = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jRadioButtonEstado = new javax.swing.JRadioButton();
        jTConsulta = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextIdVista = new javax.swing.JTextField();
        jButtonModificar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);

        jLlisAlumno.setText("ID");

        jLabel7.setText("Nombre");

        jLabel8.setText("Año");

        jLabel9.setText("Estado");

        jLTitulo.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLTitulo.setText("Consulta de Materias");

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jTConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTConsultaActionPerformed(evt);
            }
        });

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jLabel2.setText("ID");

        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(51, 51, 51))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(62, 62, 62)))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLlisAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonEstado)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextFieldAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextIdVista, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTConsulta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                                .addComponent(jButtonBuscar)
                                .addGap(82, 82, 82))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLlisAlumno)
                    .addComponent(jTConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextIdVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButtonEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNuevo)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonSalir)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonModificar))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed

        try {
            int id = Integer.parseInt(jTConsulta.getText());
            MateriaData mat = new MateriaData();
            Materia materiaEncontrada = mat.buscarMateria(id);

            if (materiaEncontrada != null) {
                jTextFieldNombre.setText(materiaEncontrada.getNombre());
                jTextFieldNombre.setEditable(false);
                jTextFieldAnio.setText(String.valueOf(materiaEncontrada.getAnioMateria()));
                jTextFieldAnio.setEditable(false);
                jTextIdVista.setText(String.valueOf(materiaEncontrada.getIdMateria()));
                jTextIdVista.setEditable(false);
                jRadioButtonEstado.setText(String.valueOf(materiaEncontrada.isEstado()));
                jRadioButtonEstado.setSelected(true);
                jRadioButtonEstado.setEnabled(false);   

                jTConsulta.setText("");
                jButtonGuardar.setEnabled(false);
                //jButtonEliminar.setEnabled(false);
                //jButtonModificar.setEnabled(false);
                // jButtonBuscar.setEnabled(false);
            } else {
                jTConsulta.setText("");
                jTextIdVista.setText("");
                jTextFieldNombre.setText("");
                jTextFieldAnio.setText("");
                jRadioButtonEstado.setText("");
            }
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID válido.");
            jTextIdVista.setText("");
            jTextFieldNombre.setText("");
            jTextFieldAnio.setText("");
            jRadioButtonEstado.setText("");

        }

    }//GEN-LAST:event_jButtonBuscarActionPerformed
//***********************************************************************************
    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed

        jRadioButtonEstado.setEnabled(false);
        jRadioButtonEstado.setSelected(true);
        jButtonGuardar.setEnabled(true);

        jlTitulo = new javax.swing.JLabel();
        jlTitulo.setText("Alta de materias");

        jTConsulta.setEditable(false);
        jTextFieldNombre.setText("");
        jTextFieldNombre.setEditable(true);
        jTextFieldAnio.setText("");
        jTextFieldAnio.setEditable(true);
        jRadioButtonEstado.setText("");

        //******************************************************************
        //          anular botones
        jButtonEliminar.setEnabled(false);
        jButtonModificar.setEnabled(false);
        jButtonBuscar.setEnabled(false);

        MateriaData materiaData = new MateriaData();                              //  instancia de MateriaData llamada "materiaData"
        List<Materia> listaMaterias = materiaData.listarMateria();               // Obtén la lista de materias
//******************************************************************************
        //    Encuentra el último ID en la lista
        int ultimoId = 0;
        for (Materia materia : listaMaterias) {
            if (materia.getIdMateria() > ultimoId) {
                ultimoId = materia.getIdMateria();
            }
        }

        //  Calcula el próximo ID disponible
        int ultimo = ultimoId + 1;

        jTextIdVista.setText(String.valueOf(ultimo));
//****************************************************************************** 
        //   jTextIdVista.setText("");
        jTextIdVista.setEditable(false);


    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed

//        Para lograr que un botón permita editar los campos cuando se pulsa una vez y guardar
//        los cambios cuando se pulsa nuevamente,  utilizo una variable booleana que
//        cambia su valor cada vez que se pulsa el botón
        jButtonGuardar.setEnabled(false);
        jButtonEliminar.setEnabled(false);
        jButtonNuevo.setEnabled(false);
        try {
            if (!isEditando) {
                // Habilitar la edición de los campos de texto
                jTextFieldNombre.setEditable(true);
                jTextFieldAnio.setEditable(true);
                jRadioButtonEstado.setEnabled(false);
                isEditando = true; // Cambia a modo edición
            } else {
                // Crear una instancia de Materia y establecer sus propiedades
                Materia materia = new Materia();
                materia.setNombre(jTextFieldNombre.getText());
                materia.setAnioMateria(Integer.parseInt(jTextFieldAnio.getText()));
                materia.setIdMateria(Integer.parseInt(jTextIdVista.getText()));
                materia.setEstado(jRadioButtonEstado.isSelected());

                //  Crear una instancia de MateriaData y modificar la Materia
                String nombre = jTextFieldNombre.getText();
                String anioTexto = jTextFieldAnio.getText();
                boolean estado = jRadioButtonEstado.isSelected();

                // Validar que los campos obligatorios no estén vacíos
                if (nombre.isEmpty() || anioTexto.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos ");
                    return; // No continuar si los datos no son válidos
                }

                int anio;

                // Intentar convertir la cadena de texto a un entero
                anio = Integer.parseInt(anioTexto);

                // creando un objeto del tipo materiaData  y lo almacena en una variable llamada modificar
                MateriaData modificar = new MateriaData();

                // Verificar si ya existe una materia con el mismo nombre y año
                for (Materia materiaExistente : modificar.listarMateria()) {
                    if (materiaExistente.getNombre().equals(nombre) && materiaExistente.getAnioMateria() == anio) {
                        JOptionPane.showMessageDialog(this, "Ya existe una materia con el mismo nombre y año.");
                        isEditando = false; // Restablece isEditando a false
                        return; // No agregues la nueva materia si ya existe una igual
                    }
                }
                // Realizar la modificación de la materia en la base de datos
                modificar.modificarMateria(materia);
                // Limpiar los campos de texto y deshabilitar la edición
                jTextFieldNombre.setText("");
                jTextFieldAnio.setText("");
                jTextIdVista.setText("");
                jRadioButtonEstado.setText("");
                // Cambia a modo no edición
                isEditando = false;
            }         
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,"Por favor, coloque un numero valido");
            
           }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed

        try {
            // Obtener el ID de la materia
            int id = Integer.parseInt(jTextIdVista.getText());

            // Crear una instancia de MateriaData
            MateriaData mat = new MateriaData();

            // Llamar al método eliminarMateria
            mat.eliminarMateria(id);

            // Limpia los campos del formulario después de eliminar
            jTextIdVista.setText("");
            jTextFieldNombre.setText("");
            jTextFieldAnio.setText("");
            jRadioButtonEstado.setSelected(false);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID válido.");
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed

        // Obtener los datos de la interfaz de usuario
        String nombre = jTextFieldNombre.getText();
        String anioTexto = jTextFieldAnio.getText();
        boolean estado = jRadioButtonEstado.isSelected();

        // Validar que los campos obligatorios no estén vacíos
        if (nombre.isEmpty() || anioTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete el campo");
            return; // No continúes si los datos no son válidos
        }

        int anio;

        try {
            // Intentar convertir la cadena de texto a un entero
            anio = Integer.parseInt(anioTexto);

            // código para crear y guardar la Materia
            Materia nuevaMateria = new Materia(anio, nombre, estado);  //Esto te permite crear una nueva instancia de la 
            //clase Materia con los datos proporcionados por el usuario
            MateriaData materiaData = new MateriaData();            //crea una nueva instancia de la clase MateriaData. Esta clase
            // podría ser responsable de interactuar con una base de datos

            for (Materia materiaExistente : materiaData.listarMateria()) {
                if (materiaExistente.getNombre().equals(nombre) && materiaExistente.getAnioMateria() == anio) {
                    JOptionPane.showMessageDialog(this, "Ya existe una materia con el mismo nombre y año.");
                    return; // No agregues la nueva materia si ya existe una igual
                }
            }

            materiaData.guardarMateria(nuevaMateria); // Invocar el método para guardar

            // Cerrar la ventana actual
            // this.dispose();
            // Restablecer los campos
            jTextFieldNombre.setText("");
            jTextFieldAnio.setText("");
            jRadioButtonEstado.setSelected(false);
            jTextIdVista.setText("");
        } catch (NumberFormatException e) {
            // Si ocurre una excepción al convertir a entero, muestra un mensaje de error
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un año válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jTConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTConsultaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLlisAlumno;
    private javax.swing.JRadioButton jRadioButtonEstado;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTConsulta;
    private javax.swing.JTextField jTextFieldAnio;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextIdVista;
    // End of variables declaration//GEN-END:variables
}
