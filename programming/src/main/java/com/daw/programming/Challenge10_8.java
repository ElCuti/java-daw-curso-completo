/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.daw.programming;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class Challenge10_8 extends javax.swing.JPanel {

    String name = "";
    int nota = 0;
    String asig = "";

    public Challenge10_8() {
        initComponents();
        jInfo.setEditable(false);
    }

    public static void main(String[] args) {
        Challenge10_8 jPanelEditor = new Challenge10_8();
        JFrame window = new JFrame("Mi Editor");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(jPanelEditor);
        window.setSize(750, 500);
        window.setLocation(100, 100);
        window.setVisible(true);

    }

    public void cargarDatosTabla() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jModificar = new javax.swing.JButton();
        jIntroducir = new javax.swing.JButton();
        jBorrar = new javax.swing.JButton();
        jSeleccionar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jAsig = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jNota = new javax.swing.JTextField();
        jInfo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        jModificar.setText("MODIFICAR");
        jModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificarActionPerformed(evt);
            }
        });

        jIntroducir.setText("INTRODUCIR");
        jIntroducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIntroducirActionPerformed(evt);
            }
        });

        jBorrar.setText("BORRAR");
        jBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBorrarActionPerformed(evt);
            }
        });

        jSeleccionar.setText("SELECCIONAR");
        jSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSeleccionarActionPerformed(evt);
            }
        });

        jLabel1.setText("NOMBRE");

        jNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNombreActionPerformed(evt);
            }
        });

        jLabel2.setText("ASIGNATURA");

        jAsig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAsigActionPerformed(evt);
            }
        });

        jLabel3.setText("NOTA");

        jNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNotaActionPerformed(evt);
            }
        });

        jInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInfoActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jIntroducir)
                            .addComponent(jModificar)
                            .addComponent(jBorrar)
                            .addComponent(jSeleccionar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jNota, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jAsig, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel3)))
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jAsig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(jSeleccionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jIntroducir)
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBorrarActionPerformed
        Connection conn = SQLiteHelper.getConnection();
        try {
            String sql = "delete from MARKS where module=? and username=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(2, jNombre.getText());
            ps.setString(1, jAsig.getText());

            int numRows = ps.executeUpdate();
            jInfo.setText(numRows + " row(s) deleted.");
        } catch (SQLException ex) {
            jInfo.setText("ERROR: Hable con el Admin");
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }    }//GEN-LAST:event_jBorrarActionPerformed

    private void jNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNombreActionPerformed
        Connection conn = SQLiteHelper.getConnection();    }//GEN-LAST:event_jNombreActionPerformed

    private void jAsigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAsigActionPerformed
        Connection conn = SQLiteHelper.getConnection();    }//GEN-LAST:event_jAsigActionPerformed

    private void jNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNotaActionPerformed
        Connection conn = SQLiteHelper.getConnection();    }//GEN-LAST:event_jNotaActionPerformed

    private void jIntroducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIntroducirActionPerformed
        Connection conn = SQLiteHelper.getConnection();
        try {
            String sql = "INSERT INTO MARKS (username, module, mark) values (?, ?, ?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, jNombre.getText());
            ps.setString(2, jAsig.getText());
            ps.setInt(3, Integer.parseInt(jNota.getText()));
            int numRows = ps.executeUpdate();
            jInfo.setText(numRows + " row(s) inserted.");
        } catch (SQLException ex) {
            jInfo.setText("ERROR: Hable con el Admin");
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jIntroducirActionPerformed

    private void jModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificarActionPerformed
        Connection conn = SQLiteHelper.getConnection();
        try {
            String sql = "update MARKS set mark =? where module=? and username=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(3, jNombre.getText());
            ps.setString(2, jAsig.getText());
            ps.setInt(1, Integer.parseInt(jNota.getText()));

            int numRows = ps.executeUpdate();
            jInfo.setText(numRows + " row(s) modified.");
        } catch (SQLException ex) {
            jInfo.setText("ERROR: Hable con el Admin");
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }    }//GEN-LAST:event_jModificarActionPerformed

    private void jSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSeleccionarActionPerformed
        Connection conn = SQLiteHelper.getConnection();
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Username");
            modelo.addColumn("Module");
            modelo.addColumn("Mark");
            jTable.setModel(modelo);
            if (jAsig.getText().equals("")) {
                String sql = "select * from marks where username =?";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, jNombre.getText());
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    String[] datos = {rs.getString("username"), rs.getString("module"), rs.getString("mark")};
                    modelo.addRow(datos);
                }
            } else {
                String sql = "select * from marks where username =? and module=?;";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, jNombre.getText());
                ps.setString(2, jAsig.getText());
                ResultSet rs = ps.executeQuery();
                if (rs.getString("mark") == null) {
                    jInfo.setText("No disponemos de ese registro");
                } else {
                    jNota.setText(rs.getString("mark"));
                }
            }

        } catch (SQLException ex) {
            jInfo.setText("ERROR: Hable con el Admin");
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jSeleccionarActionPerformed

    private void jInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInfoActionPerformed

    }//GEN-LAST:event_jInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAsig;
    private javax.swing.JButton jBorrar;
    private javax.swing.JTextField jInfo;
    private javax.swing.JButton jIntroducir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jModificar;
    private javax.swing.JTextField jNombre;
    private javax.swing.JTextField jNota;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSeleccionar;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
