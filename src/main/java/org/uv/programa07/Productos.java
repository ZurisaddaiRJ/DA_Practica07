/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.uv.programa07;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author zuley
 */
public class Productos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Productos
     */
    private DAOProducto daoproducto = null;
    private boolean isNew = false;

    public Productos() {
        initComponents();
        daoproducto = new DAOProducto();
        fillData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btoNuevo = new javax.swing.JButton();
        btoGuardar = new javax.swing.JButton();
        btoModificar = new javax.swing.JButton();
        btoEliminar = new javax.swing.JButton();
        Principal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Catalogo de Productos");

        jToolBar1.setRollover(true);

        btoNuevo.setText("Nuevo");
        btoNuevo.setFocusable(false);
        btoNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoNuevo.setName("Nuevo"); // NOI18N
        btoNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoNuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(btoNuevo);
        btoNuevo.getAccessibleContext().setAccessibleDescription("");

        btoGuardar.setText("Guardar");
        btoGuardar.setFocusable(false);
        btoGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btoGuardar);

        btoModificar.setText("Modificar");
        btoModificar.setFocusable(false);
        btoModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoModificarActionPerformed(evt);
            }
        });
        jToolBar1.add(btoModificar);

        btoEliminar.setText("Eliminar");
        btoEliminar.setFocusable(false);
        btoEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoEliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(btoEliminar);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jLabel1.setText("Clave");

        jLabel2.setText("Nombre");

        jLabel3.setText("Precio");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        getContentPane().add(Principal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoNuevoActionPerformed
        // TODO add your handling code here:
        isNew = true;
    }//GEN-LAST:event_btoNuevoActionPerformed

    private void btoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoGuardarActionPerformed
        // TODO add your handling code here:
        if (isNew) {
            Producto p = new Producto();
            p.setNombre(txtNombre.getText());
            double precio = Double.parseDouble(txtPrecio.getText());
            p.setPrecio(precio);
            daoproducto.create(p);
            txtClave.setText(String.valueOf(p.getClave()));
            JOptionPane.showMessageDialog(this, "Se guardo");
        }
    }//GEN-LAST:event_btoGuardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Producto p = daoproducto.findById(Long.parseLong(txtClave.getText()));
        if (p != null) {
            txtNombre.setText(p.getNombre());
            txtPrecio.setText(String.valueOf(p.getPrecio()));
        } else {
            JOptionPane.showMessageDialog(this, "Este producto no existe");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoEliminarActionPerformed
        // TODO add your handling code here:
        Producto p = daoproducto.findById(Long.parseLong(txtClave.getText()));
        if (p != null) {
            daoproducto.delete(p.getClave());
            JOptionPane.showMessageDialog(this, "Se elimino");
        } else {
            JOptionPane.showMessageDialog(this, "Este producto no existe");
        }

    }//GEN-LAST:event_btoEliminarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        fillData();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoModificarActionPerformed
        // TODO add your handling code here:
        Producto p = daoproducto.findById(Long.parseLong(txtClave.getText()));
        p.setNombre(txtNombre.getText());
        double precio = Double.parseDouble(txtPrecio.getText());
        p.setPrecio(precio);
        daoproducto.update(p, Long.parseLong(txtClave.getText()));
        JOptionPane.showMessageDialog(this, "Se actualizo");
    }//GEN-LAST:event_btoModificarActionPerformed

    public void fillData() {
        List<String> columns = new ArrayList<String>();
        List<String[]> values = new ArrayList<String[]>();
        columns.add("Clave");
        columns.add("Nombre");
        columns.add("Precio");

        List<Producto> lstProductor = daoproducto.findAll();
        for (Producto producto : lstProductor) {
            values.add(new String[]{String.valueOf(producto.getClave()),
                producto.getNombre(), String.valueOf(producto.getPrecio())});
        }
        TableModel tablemodel
                = new DefaultTableModel(
                        values.toArray(new Object[][]{}), columns.toArray());
        jTable1.setModel(tablemodel);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Principal;
    private javax.swing.JButton btoEliminar;
    private javax.swing.JButton btoGuardar;
    private javax.swing.JButton btoModificar;
    private javax.swing.JButton btoNuevo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}