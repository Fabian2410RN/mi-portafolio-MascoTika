/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;

/**
 *
 * @author luigy
 */
public class CRUDHorariosVeterinario extends javax.swing.JFrame {
    
    Controlador controlador = new Controlador();

    /**
     * Creates new form CRUDHorariosVeterinario
     */
    public CRUDHorariosVeterinario() {
        initComponents();
        setLocationRelativeTo(null);
        txtROLHorario.setVisible(false);
        txtUSERHorario.setVisible(false);
        IDVeterinario.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Volver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHorarios = new javax.swing.JTable();
        Crear = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        IDVeterinario = new javax.swing.JTextField();
        BorrarTodos = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        HoraFinal = new javax.swing.JTextField();
        HoraInicio = new javax.swing.JTextField();
        txtROLHorario = new javax.swing.JTextField();
        txtUSERHorario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Día");

        Volver.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        tblHorarios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblHorarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "IDVeterinario", "Día", "Hora inicio", "Hora final"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHorarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHorariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHorarios);
        if (tblHorarios.getColumnModel().getColumnCount() > 0) {
            tblHorarios.getColumnModel().getColumn(0).setResizable(false);
            tblHorarios.getColumnModel().getColumn(1).setResizable(false);
            tblHorarios.getColumnModel().getColumn(2).setResizable(false);
            tblHorarios.getColumnModel().getColumn(3).setResizable(false);
        }

        Crear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Crear.setText("Crear");
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });

        Buscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        Actualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        Borrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Borrar.setText("Borrar Horario");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Administrar horarios veterinario");

        BorrarTodos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BorrarTodos.setText("Borrar Horarios");
        BorrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarTodosActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Hora Inicio");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Hora Final");

        HoraFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoraFinalActionPerformed(evt);
            }
        });

        HoraInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoraInicioActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(IDVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(34, 34, 34))
                                .addComponent(txtUSERHorario)
                                .addComponent(txtROLHorario))
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Dia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Borrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HoraFinal)
                            .addComponent(HoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Crear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BorrarTodos, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Crear)
                                .addComponent(Dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Buscar)
                                .addGap(18, 18, 18)
                                .addComponent(Actualizar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(HoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(HoraFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtROLHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Borrar)
                                    .addComponent(txtUSERHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Volver)
                                    .addComponent(IDVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(BorrarTodos)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiaActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        String ne = this.txtROLHorario.getText();
        String nn = this.txtUSERHorario.getText();
        CRUDVeterinario ru = new CRUDVeterinario();
        ru.setVisible(true);
        this.dispose();
        CRUDVeterinario.txtObtenerRolInicio.setText(ne);
        CRUDVeterinario.txtObtenerUsuarioq1.setText(nn);
        
    }//GEN-LAST:event_VolverActionPerformed

    private void tblHorariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHorariosMouseClicked
        try{
            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT IDVeterinario, Dia, HoraInicio, HoraFinal FROM HorariosAtencion_Veterinario");
            rs = ps.executeQuery();
            while(rs.next()){
                IDVeterinario.setText(rs.getString("IDVeterinario"));
                Dia.setText(rs.getString("Dia"));
                HoraInicio.setText(rs.getString("HoraInicio"));
                HoraFinal.setText(rs.getString("HoraFinal"));
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_tblHorariosMouseClicked

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
        try {
            // TODO add your handling code here:
            int id = Integer.parseInt(this.IDVeterinario.getText());
            controlador.RegistrarHorariosAtencion_Veterinario(id, this.Dia.getText(), this.HoraInicio.getText(), this.HoraFinal.getText());
            limpiarTxt();
        } catch (SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
            Logger.getLogger(CRUDUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CrearActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        cargarTabla();
    }//GEN-LAST:event_BuscarActionPerformed

    private void limpiarTxt(){
        Dia.setText("");
        HoraInicio.setText("");
        HoraFinal.setText("");
    }
    
    private void cargarTabla(){
        DefaultTableModel modeloTabla = (DefaultTableModel) tblHorarios.getModel();
        modeloTabla.setRowCount(0);
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rmsd;
        int columnas;
        
        int[] anchos = {50, 50, 50, 50};
        for(int i = 0; i < tblHorarios.getColumnCount();i++){
            tblHorarios.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
        String user = IDVeterinario.getText();
        try{
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT IDVeterinario, Dia, HoraInicio, HoraFinal FROM HorariosAtencion_Veterinario WHERE IDVeterinario = ?");
            ps.setString(1, user);
            rs = ps.executeQuery();
            rmsd = rs.getMetaData();
            columnas = rmsd.getColumnCount();
            
            while(rs.next()){
                Object[] fila = new Object[columnas];
                for(int indice = 0; indice < columnas; indice++){
                    fila[indice] = rs.getObject(indice+1);
                }
                modeloTabla.addRow(fila);
                
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        try {
            // TODO add your handling code here:
            int id = Integer.parseInt(this.IDVeterinario.getText());
            controlador.ActualizarHorariosAtencion_Veterinario(id, this.Dia.getText(), this.HoraInicio.getText(), this.HoraFinal.getText());
            limpiarTxt();
        } catch (SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
            Logger.getLogger(CRUDUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ActualizarActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        try {
            // TODO add your handling code here:
            controlador.BorrarHorarioAtencion_Veterinario(this.Dia.getText());
            limpiarTxt();
        } catch (SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
            Logger.getLogger(CRUDUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BorrarActionPerformed

    private void BorrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarTodosActionPerformed
        try {
            // TODO add your handling code here:
            int id = Integer.parseInt(this.IDVeterinario.getText());
            controlador.BorrarHorariosAtencion_Veterinario(id);
            limpiarTxt();
        } catch (SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
            Logger.getLogger(CRUDUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BorrarTodosActionPerformed

    private void HoraFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoraFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoraFinalActionPerformed

    private void HoraInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoraInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoraInicioActionPerformed

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
            java.util.logging.Logger.getLogger(CRUDHorariosVeterinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDHorariosVeterinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDHorariosVeterinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDHorariosVeterinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDHorariosVeterinario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton Borrar;
    private javax.swing.JButton BorrarTodos;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Crear;
    private javax.swing.JTextField Dia;
    private javax.swing.JTextField HoraFinal;
    private javax.swing.JTextField HoraInicio;
    public static javax.swing.JTextField IDVeterinario;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHorarios;
    public static javax.swing.JTextField txtROLHorario;
    public static javax.swing.JTextField txtUSERHorario;
    // End of variables declaration//GEN-END:variables
}
