/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisi;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yglx
 */
public class masuk extends javax.swing.JFrame {
 
    masuk login;
    
    awal aw;
    public static Object[] id_user = new Object[3];
    Connection con = koneksi.getConnection();
    Statement stt;
    ResultSet rss;
    
    public masuk() {
        initComponents();
    }
    public static Object[] getSiswa(){
        return id_user;
    }
    
        private void ProsesLogin(){
        try{
            Statement stt = (Statement)koneksi.getConnection().createStatement();
            ResultSet rss=stt.executeQuery
            ("select * from user where username='"+jUsername1.getText()+"'" );
            if(rss.next()){
                if(jPassword1.getText().equals(rss.getString("password"))){
                    id_user[0] = rss.getString("id");
                    id_user[1] = rss.getString("username");
                    int level =Integer.parseInt(rss.getString("level"));
                    if(level==1){
                        new awal().setVisible(true);
                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "User tidak ditemukan");
                        jUsername1.setText("");
                        jPassword1.setText("");
                         jUsername1.requestFocus();  
                    }
                    id_user[1] = rss.getString("level");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Password Salah");
                    jPassword1.setText("");
                    jPassword1.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "User tidak ditemukan");
                jUsername1.setText("");
                jPassword1.setText("");
                jUsername1.requestFocus();
            }

        } catch (SQLException ex) {
            Logger.getLogger(masuk.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Gagal Login!");
        }
    }
        
     
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPassword1 = new javax.swing.JPasswordField();
        jUsername1 = new javax.swing.JTextField();
        panel3 = new java.awt.Panel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        panel1.setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Halaman Login");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("USERNAME");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("PASSWORD");

        jPassword1.setBackground(new java.awt.Color(44, 62, 80));
        jPassword1.setForeground(new java.awt.Color(255, 255, 255));
        jPassword1.setText("jPasswordField1");
        jPassword1.setBorder(null);
        jPassword1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPassword1FocusGained(evt);
            }
        });

        jUsername1.setBackground(new java.awt.Color(44, 62, 80));
        jUsername1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jUsername1.setForeground(new java.awt.Color(204, 204, 204));
        jUsername1.setText("Masukan username anda");
        jUsername1.setBorder(null);
        jUsername1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jUsername1CaretUpdate(evt);
            }
        });
        jUsername1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jUsername1MouseClicked(evt);
            }
        });

        panel3.setBackground(new java.awt.Color(119, 186, 255));
        panel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel3MouseClicked(evt);
            }
        });
        panel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(44, 62, 80));
        jLabel6.setText("Masuk");
        panel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator1)
                            .addComponent(jPassword1)
                            .addComponent(jUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(98, 98, 98))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        getContentPane().add(panel1, "card3");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jUsername1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jUsername1MouseClicked
        jUsername1.setText("");
    }//GEN-LAST:event_jUsername1MouseClicked

    private void jPassword1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPassword1FocusGained
        jPassword1.setText("");
    }//GEN-LAST:event_jPassword1FocusGained

    private void panel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel3MouseClicked
        
      
            ProsesLogin();
        
       
    }//GEN-LAST:event_panel3MouseClicked

    private void jUsername1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jUsername1CaretUpdate
           // TODO add your handling code here:
           System.out.println("");
    }//GEN-LAST:event_jUsername1CaretUpdate

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
            java.util.logging.Logger.getLogger(masuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(masuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(masuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(masuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new masuk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPassword1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jUsername1;
    private java.awt.Panel panel1;
    private java.awt.Panel panel3;
    // End of variables declaration//GEN-END:variables

    
}
