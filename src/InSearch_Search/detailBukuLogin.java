package InSearch_Search;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import login.LoginPage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSI PC
 */
public class detailBukuLogin extends javax.swing.JFrame {

    /**
     * Creates new form detailBuku
     */
    public detailBukuLogin() {
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

        gambarSampul = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        judulTxt = new javax.swing.JLabel();
        penulisTxt = new javax.swing.JLabel();
        penerbitTxt = new javax.swing.JLabel();
        ISBNTxt = new javax.swing.JLabel();
        TahunTxt = new javax.swing.JLabel();
        kategoriTxt = new javax.swing.JLabel();
        bahasaTxt = new javax.swing.JLabel();
        halamanTxt = new javax.swing.JLabel();
        stokTxt = new javax.swing.JLabel();
        letakTxt = new javax.swing.JLabel();
        deskripsiTxt = new javax.swing.JLabel();
        addBookmark = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        kolomCariDetail = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        deleteBookmark = new javax.swing.JButton();
        addBooking = new javax.swing.JButton();
        deleteBooking = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1600, 900));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Judul             ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Nama Penulis  ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Penerbit         ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("NO. ISBN       ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Tahun           ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Kategori         ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Bahasa           ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Halaman        ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Stok              ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Letak            ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Deskripsi       ");

        judulTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        judulTxt.setText("jLabel12");

        penulisTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        penulisTxt.setText("jLabel12");

        penerbitTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        penerbitTxt.setText("jLabel12");

        ISBNTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ISBNTxt.setText("jLabel12");

        TahunTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TahunTxt.setText("jLabel12");

        kategoriTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kategoriTxt.setText("jLabel12");

        bahasaTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bahasaTxt.setText("jLabel12");

        halamanTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        halamanTxt.setText("jLabel12");

        stokTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stokTxt.setText("jLabel12");

        letakTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        letakTxt.setText("jLabel12");

        deskripsiTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deskripsiTxt.setText("jLabel12");
        deskripsiTxt.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        addBookmark.setFont(new java.awt.Font("Leelawadee UI", 0, 13)); // NOI18N
        addBookmark.setIcon(new javax.swing.ImageIcon("D:\\Hammam File\\Telkom University\\SEMESTER 5\\RPL Implementasi\\add-bookmark-icon 20px.png")); // NOI18N
        addBookmark.setText("Add Bookmark");
        addBookmark.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBookmarkMouseClicked(evt);
            }
        });
        addBookmark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookmarkActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel12.setText("InSearch");

        searchButton.setFont(new java.awt.Font("Leelawadee UI", 0, 13)); // NOI18N
        searchButton.setIcon(new javax.swing.ImageIcon("D:\\Hammam File\\Telkom University\\SEMESTER 5\\RPL Implementasi\\loupe 20px.png")); // NOI18N
        searchButton.setText("Search");
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });

        logoutButton.setFont(new java.awt.Font("Leelawadee UI", 0, 13)); // NOI18N
        logoutButton.setText("LOGOUT");
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setIcon(new javax.swing.ImageIcon("D:\\Hammam File\\Telkom University\\SEMESTER 5\\RPL Implementasi\\profile-user 20px.png")); // NOI18N

        kolomCariDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomCariDetailActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Leelawadee UI", 0, 13)); // NOI18N
        backButton.setIcon(new javax.swing.ImageIcon("D:\\Hammam File\\Telkom University\\SEMESTER 5\\RPL Implementasi\\icons8-back-arrow-20px.png")); // NOI18N
        backButton.setText("Back");
        backButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        backButton.setBorderPainted(false);
        backButton.setContentAreaFilled(false);
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(155, 155, 155)
                .addComponent(kolomCariDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kolomCariDetail)
                    .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        deleteBookmark.setFont(new java.awt.Font("Leelawadee UI", 0, 13)); // NOI18N
        deleteBookmark.setIcon(new javax.swing.ImageIcon("D:\\Hammam File\\Telkom University\\SEMESTER 5\\RPL Implementasi\\remove-bookmark-icon 20px.png")); // NOI18N
        deleteBookmark.setText("Delete Bookmark");
        deleteBookmark.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBookmarkMouseClicked(evt);
            }
        });
        deleteBookmark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBookmarkActionPerformed(evt);
            }
        });

        addBooking.setFont(new java.awt.Font("Leelawadee UI", 0, 13)); // NOI18N
        addBooking.setIcon(new javax.swing.ImageIcon("D:\\Hammam File\\Telkom University\\SEMESTER 5\\RPL Implementasi\\icons8-booking-30px.png")); // NOI18N
        addBooking.setText("Add Booking");
        addBooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBookingMouseClicked(evt);
            }
        });
        addBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookingActionPerformed(evt);
            }
        });

        deleteBooking.setFont(new java.awt.Font("Leelawadee UI", 0, 13)); // NOI18N
        deleteBooking.setIcon(new javax.swing.ImageIcon("D:\\Hammam File\\Telkom University\\SEMESTER 5\\RPL Implementasi\\icons8-cancel-30.png")); // NOI18N
        deleteBooking.setText("Delete Booking");
        deleteBooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBookingMouseClicked(evt);
            }
        });
        deleteBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBookingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(gambarSampul, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel1))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bahasaTxt)
                    .addComponent(halamanTxt)
                    .addComponent(stokTxt)
                    .addComponent(letakTxt)
                    .addComponent(deskripsiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TahunTxt)
                    .addComponent(kategoriTxt)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(judulTxt)
                            .addComponent(penulisTxt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addBooking, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteBooking, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deleteBookmark, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addBookmark, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(ISBNTxt)
                    .addComponent(penerbitTxt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(gambarSampul, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(judulTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(penulisTxt))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(penerbitTxt))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(ISBNTxt))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(TahunTxt))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(kategoriTxt))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(bahasaTxt))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(halamanTxt))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(stokTxt))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(letakTxt))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(addBookmark, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(deleteBookmark, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deleteBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(deskripsiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBookmarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookmarkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBookmarkActionPerformed

    private void addBookmarkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBookmarkMouseClicked
        // TODO add your handling code here:
        Connection conn = koneksi.koneksiDb();
        Statement st;
        ResultSet rs;
        PreparedStatement ps;
        
        String username = jLabel13.getText();
        int id_user = 0;
        int id_buku = hasilSearchLogin.getId();
        
        try{
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM `user` WHERE `username` = '"+username+"'");
            while (rs.next()) {
                id_user = rs.getInt("id_user");
            }
            boolean cekData = true;
            try{
                st = conn.createStatement();
                rs = st.executeQuery("SELECT * FROM `bookmark`");
                while (rs.next()) {
                    if ((rs.getInt("id_user") == id_user) && (rs.getInt("id_buku") == id_buku)) {
                        cekData = false;
                    }
                }
                if (cekData == true) {
                    try {
                        String sql = "INSERT INTO `bookmark` (`id_bookmark`, `id_user`, `id_buku`) VALUES (NULL, '"+id_user+"', '"+id_buku+"')";
                        ps = conn.prepareStatement(sql);
                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Buku berhasil ditambahkan ke bookmark!");
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
                        
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Anda telah menyimpan buku ini ke Bookmark");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_addBookmarkMouseClicked

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        // TODO add your handling code here:
        hasilSearchLogin hasil = new hasilSearchLogin();
        hasil.setVisible(true);
        hasilSearchLogin.kolomCari.setText(kolomCariDetail.getText());
        hasilSearchLogin.jLabel2.setText(LoginPage.getUsername());
        hasil.populateJTable();
        hasil.pack();
        hasil.setLocationRelativeTo(null);
        hasil.setDefaultCloseOperation(SearchAfterLogin.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_searchButtonMouseClicked

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        // TODO add your handling code here:
        SearchUI2 search = new SearchUI2();
        search.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void kolomCariDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomCariDetailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kolomCariDetailActionPerformed

    private void deleteBookmarkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBookmarkMouseClicked
        // TODO add your handling code here:
        Connection conn = koneksi.koneksiDb();
        Statement st;
        ResultSet rs;
        PreparedStatement ps;
        
        String username = jLabel13.getText();
        int id_user = 0;
        int id_buku = hasilSearchLogin.getId();
        
        try{
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM `user` WHERE `username` = '"+username+"'");
            while (rs.next()) {
                id_user = rs.getInt("id_user");
            }
            boolean cekData = false;
            try{
                st = conn.createStatement();
                rs = st.executeQuery("SELECT * FROM `bookmark`");
                while (rs.next()) {
                    if ((rs.getInt("id_user") == id_user) && (rs.getInt("id_buku") == id_buku)) {
                        cekData = true;
                    }
                }
                if (cekData == true) {
                    try {
                        String sql = "DELETE FROM bookmark WHERE `bookmark`.`id_user` = "+id_user+" AND `bookmark`.`id_buku` = "+id_buku;
                        ps = conn.prepareStatement(sql);
                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Buku berhasil dihapus dari bookmark!");
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
                        
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Anda belum menambahkan buku ini ke Bookmark");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteBookmarkMouseClicked

    private void deleteBookmarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBookmarkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBookmarkActionPerformed

    private void addBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBookingMouseClicked
        // TODO add your handling code here:
        Connection conn = koneksi.koneksiDb();
        Statement st;
        ResultSet rs;
        PreparedStatement ps, ps1;
        
        String username = jLabel13.getText();
        int id_user = 0;
        int id_buku = hasilSearchLogin.getId();
        
        try{
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM `user` WHERE `username` = '"+username+"'");
            while (rs.next()) {
                id_user = rs.getInt("id_user");
            }
            
            
            boolean cekData = true;
            try{
                st = conn.createStatement();
                rs = st.executeQuery("SELECT * FROM `booking`");
                while (rs.next()) {
                    if ((rs.getInt("id_user") == id_user) && (rs.getInt("id_buku") == id_buku)) {
                        cekData = false;
                    }
                }
                if (cekData == true) {
                    try {
                        String sql = "INSERT INTO `booking` (`id_booking`, `id_user`, `id_buku`) VALUES (NULL, '"+id_user+"', '"+id_buku+"')";
                        String sql1 = "UPDATE `buku` SET `stok` = stok - 1 WHERE `buku`.`id_buku` = '"+id_buku+"'";
                        ps = conn.prepareStatement(sql);
                        ps.executeUpdate();
                        ps1 = conn.prepareStatement(sql1);
                        ps1.executeUpdate();
                        
                        JOptionPane.showMessageDialog(null, "Buku berhasil dibooking!");
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
                        
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Anda telah menambahkan buku ini ke Booking");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addBookingMouseClicked

    private void addBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBookingActionPerformed

    private void deleteBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBookingMouseClicked
        // TODO add your handling code here:
        Connection conn = koneksi.koneksiDb();
        Statement st;
        ResultSet rs;
        PreparedStatement ps, ps1;
        
        String username = jLabel13.getText();
        int id_user = 0;
        int id_buku = hasilSearchLogin.getId();
        
        try{
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM `user` WHERE `username` = '"+username+"'");
            while (rs.next()) {
                id_user = rs.getInt("id_user");
            }
            
            
            boolean cekData = false;
            try{
                st = conn.createStatement();
                rs = st.executeQuery("SELECT * FROM `booking`");
                while (rs.next()) {
                    if ((rs.getInt("id_user") == id_user) && (rs.getInt("id_buku") == id_buku)) {
                        cekData = true;
                    }
                }
                if (cekData == true) {
                    try {
                        String sql = "DELETE FROM booking WHERE `booking`.`id_user` = "+id_user+" AND `booking`.`id_buku` = "+id_buku;
                        String sql1 = "UPDATE `buku` SET `stok` = stok + 1 WHERE `buku`.`id_buku` = '"+id_buku+"'";
                        ps = conn.prepareStatement(sql);
                        ps.executeUpdate();
                        ps1 = conn.prepareStatement(sql1);
                        ps1.executeUpdate();
                        
                        JOptionPane.showMessageDialog(null, "Buku berhasil dihapus dari booking!");
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
                        
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Anda belum menambahkan buku ini ke Booking");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteBookingMouseClicked

    private void deleteBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBookingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBookingActionPerformed

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        // TODO add your handling code here:
        hasilSearchLogin hasil = new hasilSearchLogin();
        hasil.setVisible(true);
        hasilSearchLogin.kolomCari.setText(kolomCariDetail.getText());
        hasilSearchLogin.jLabel2.setText(LoginPage.getUsername());
        hasil.populateJTable();
        hasil.pack();
        hasil.setLocationRelativeTo(null);
        hasil.setDefaultCloseOperation(SearchAfterLogin.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_backButtonMouseClicked

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
            java.util.logging.Logger.getLogger(detailBukuLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(detailBukuLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(detailBukuLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(detailBukuLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new detailBukuLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel ISBNTxt;
    public javax.swing.JLabel TahunTxt;
    private javax.swing.JButton addBooking;
    private javax.swing.JButton addBookmark;
    private javax.swing.JButton backButton;
    public javax.swing.JLabel bahasaTxt;
    private javax.swing.JButton deleteBooking;
    private javax.swing.JButton deleteBookmark;
    public javax.swing.JLabel deskripsiTxt;
    public javax.swing.JLabel gambarSampul;
    public javax.swing.JLabel halamanTxt;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    public static javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel judulTxt;
    public javax.swing.JLabel kategoriTxt;
    private javax.swing.JTextField kolomCariDetail;
    public javax.swing.JLabel letakTxt;
    private javax.swing.JButton logoutButton;
    public javax.swing.JLabel penerbitTxt;
    public javax.swing.JLabel penulisTxt;
    private javax.swing.JButton searchButton;
    public javax.swing.JLabel stokTxt;
    // End of variables declaration//GEN-END:variables
}
