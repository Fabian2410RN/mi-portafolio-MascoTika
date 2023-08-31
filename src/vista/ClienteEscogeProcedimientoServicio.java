/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import static vista.CRUDProcedimientoServicio.txtUsuarioPro;

/**
 *
 * @author estadm
 */
public class ClienteEscogeProcedimientoServicio extends javax.swing.JFrame {

    /**
     * Creates new form CRUDProcedimientoServicio
     */
    public ClienteEscogeProcedimientoServicio() {
        initComponents();
        setLocationRelativeTo(null);
        cargarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProcedimientoServicio = new javax.swing.JTable();
        txtVolver = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        ID = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblProcedimientoServicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Descripción", "Tipo", "Monto unitario", "Monto domicilio", "ID categoría", "Nombre usuario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProcedimientoServicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProcedimientoServicioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProcedimientoServicio);
        if (tblProcedimientoServicio.getColumnModel().getColumnCount() > 0) {
            tblProcedimientoServicio.getColumnModel().getColumn(0).setResizable(false);
            tblProcedimientoServicio.getColumnModel().getColumn(1).setResizable(false);
            tblProcedimientoServicio.getColumnModel().getColumn(2).setResizable(false);
            tblProcedimientoServicio.getColumnModel().getColumn(3).setResizable(false);
            tblProcedimientoServicio.getColumnModel().getColumn(4).setResizable(false);
            tblProcedimientoServicio.getColumnModel().getColumn(5).setResizable(false);
        }

        txtVolver.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtVolver.setText("Volver");
        txtVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVolverActionPerformed(evt);
            }
        });

        txtID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ID.setText("ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Usuario");

        btnEnviar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(ID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnEnviar)
                .addGap(168, 168, 168)
                .addComponent(txtVolver)
                .addGap(0, 17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID)
                    .addComponent(jLabel2)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviar)
                    .addComponent(txtVolver))
                .addGap(0, 27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVolverActionPerformed
        CRUDCitas ru = new CRUDCitas();
        ru.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txtVolverActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void tblProcedimientoServicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProcedimientoServicioMouseClicked
        try{
            int fila = tblProcedimientoServicio.getSelectedRow();
            int id = Integer.parseInt(tblProcedimientoServicio.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT IDProcedimiento_Servicio, NombreUsuario FROM Procedimientos_Servicios");
            //ps.setInt(1, id);
            rs = ps.executeQuery();
            while(rs.next()){
                txtID.setText(String.valueOf(id));
                txtUser.setText(rs.getString("NombreUsuario"));          
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }            
    }//GEN-LAST:event_tblProcedimientoServicioMouseClicked

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        CRUDCitas.txtUsuarioVeterinarioCitas.setText(txtUser.getText());
        CRUDCitas.txtIDProcedimiento.setText(txtID.getText());
        this.dispose();
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void cargarTabla(){
        DefaultTableModel modeloTabla = (DefaultTableModel) tblProcedimientoServicio.getModel();
        modeloTabla.setRowCount(0);
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rmsd;
        int columnas;
        
        int[] anchos = {25, 150, 100, 150, 100, 100, 100, 100};
        for(int i = 0; i < tblProcedimientoServicio.getColumnCount();i++){
            tblProcedimientoServicio.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
        //String user = txtUsuarioPro.getText();
        try{
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT IDProcedimiento_Servicio, NombreProcedimiento, Descripcion, Tipo, IDCategoria, MontoUnitario, MontoServicioDomicilio, NombreUsuario FROM Procedimientos_Servicios");
            //ps.setString(1, user);
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
            java.util.logging.Logger.getLogger(ClienteEscogeProcedimientoServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteEscogeProcedimientoServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteEscogeProcedimientoServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteEscogeProcedimientoServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteEscogeProcedimientoServicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProcedimientoServicio;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtUser;
    private javax.swing.JButton txtVolver;
    // End of variables declaration//GEN-END:variables
}