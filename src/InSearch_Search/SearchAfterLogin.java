/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InSearch_Search;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import login.LoginPage;
import signup.SignupPage;


/**
 *
 * @author hamma
 */
public class SearchAfterLogin extends javax.swing.JFrame {

    /**
     * Creates new form SearchAfterLogin
     */
    public SearchAfterLogin() {
        initComponents();
        //jLabel1.setText("Hi! Welcome");
        /*Connection conn = koneksi.koneksiDb();
        try{
            Statement st=conn.createStatement();
            String sql = "SELECT username FROM user WHERE username='"+LoginPage.usernameTxt.getText()+"' or email='"+LoginPage.usernameTxt.getText()+"'";
            ResultSet rs=st.executeQuery(sql);
            
            jLabel1.setText("Hi! " + rs.getString("username"));
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }*/
        
    }
    /*public void cek_masuk(){
        Connection conn = koneksi.koneksiDb();
        try{
            Statement st=conn.createStatement();
            String sql = "SELECT username FROM user WHERE username='"+LoginPage.usernameTxt.getText()+"' or email='"+LoginPage.usernameTxt.getText()+"'";
            ResultSet rs=st.executeQuery(sql);
            
            jLabel1.setText("Hi! " + rs.getString("username"));
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kolomCariLogin = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        LogoutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bookmarkButton = new javax.swing.JButton();
        riwayatButton = new javax.swing.JButton();
        bookingtButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HomePage");
        setResizable(false);
        setSize(new java.awt.Dimension(1600, 900));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(null);

        kolomCariLogin.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        kolomCariLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        kolomCariLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomCariLoginActionPerformed(evt);
            }
        });
        jPanel1.add(kolomCariLogin);
        kolomCariLogin.setBounds(570, 350, 400, 50);

        jButton1.setFont(new java.awt.Font("Leelawadee UI", 0, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("D:\\Hammam File\\Telkom University\\SEMESTER 5\\RPL Implementasi\\loupe 12px.png")); // NOI18N
        jButton1.setText("Search");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(980, 350, 100, 50);

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        label1.setText("InSearch");

        LogoutButton.setFont(new java.awt.Font("Leelawadee UI", 0, 13)); // NOI18N
        LogoutButton.setText("LOGOUT");
        LogoutButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LogoutButton.setContentAreaFilled(false);
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Hammam File\\Telkom University\\SEMESTER 5\\RPL Implementasi\\profile-user 20px.png")); // NOI18N
        jLabel1.setText("jLabel1");

        bookmarkButton.setFont(new java.awt.Font("Leelawadee UI", 1, 13)); // NOI18N
        bookmarkButton.setText("Bookmark");
        bookmarkButton.setBorderPainted(false);
        bookmarkButton.setContentAreaFilled(false);
        bookmarkButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookmarkButtonMouseClicked(evt);
            }
        });

        riwayatButton.setFont(new java.awt.Font("Leelawadee UI", 1, 13)); // NOI18N
        riwayatButton.setText("Riwayat");
        riwayatButton.setBorderPainted(false);
        riwayatButton.setContentAreaFilled(false);
        riwayatButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                riwayatButtonMouseClicked(evt);
            }
        });

        bookingtButton.setFont(new java.awt.Font("Leelawadee UI", 1, 13)); // NOI18N
        bookingtButton.setText("Booking");
        bookingtButton.setBorderPainted(false);
        bookingtButton.setContentAreaFilled(false);
        bookingtButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookingtButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bookingtButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(riwayatButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bookmarkButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogoutButton)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bookmarkButton)
                    .addComponent(riwayatButton)
                    .addComponent(bookingtButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1576, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kolomCariLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomCariLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kolomCariLoginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        SearchUI2 search = new SearchUI2();
        search.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        hasilSearchLogin hasil = new hasilSearchLogin();
        hasil.setVisible(true);
        hasilSearchLogin.kolomCari.setText(kolomCariLogin.getText());
        hasilSearchLogin.jLabel2.setText(LoginPage.getUsername());
        hasil.populateJTable();
        hasil.pack();
        hasil.setLocationRelativeTo(null);
        hasil.setDefaultCloseOperation(SearchAfterLogin.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void bookmarkButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookmarkButtonMouseClicked
        // TODO add your handling code here:
        bookmark bm = new bookmark();
        bm.setVisible(true);
        bookmark.jLabel2.setText(LoginPage.getUsername());
        bm.populateJTable();
        bm.pack();
        bm.setLocationRelativeTo(null);
        bm.setDefaultCloseOperation(SearchAfterLogin.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_bookmarkButtonMouseClicked

    private void riwayatButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_riwayatButtonMouseClicked
        // TODO add your handling code here:
        riwayat rw = new riwayat();
        rw.setVisible(true);
        riwayat.jLabel2.setText(LoginPage.getUsername());
        rw.populateJTable();
        rw.pack();
        rw.setLocationRelativeTo(null);
        rw.setDefaultCloseOperation(SearchAfterLogin.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_riwayatButtonMouseClicked

    private void bookingtButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingtButtonMouseClicked
        // TODO add your handling code here:
        booking bk = new booking();
        bk.setVisible(true);
        booking.jLabel2.setText(LoginPage.getUsername());
        bk.populateJTable();
        bk.pack();
        bk.setLocationRelativeTo(null);
        bk.setDefaultCloseOperation(SearchAfterLogin.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_bookingtButtonMouseClicked

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
            java.util.logging.Logger.getLogger(SearchAfterLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchAfterLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchAfterLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchAfterLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchAfterLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton bookingtButton;
    private javax.swing.JButton bookmarkButton;
    private javax.swing.JButton jButton1;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField kolomCariLogin;
    private java.awt.Label label1;
    private javax.swing.JButton riwayatButton;
    // End of variables declaration//GEN-END:variables
}
