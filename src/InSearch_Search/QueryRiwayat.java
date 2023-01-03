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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import login.LoginPage;

/**
 *
 * @author hamma
 */
public class QueryRiwayat {

    /**
     *
     * @return
     */
    
    public static ArrayList<String> list_waktu = new ArrayList<String>();
    public static String waktu = null;
    
    public ArrayList<buku> BindTable(){
        ArrayList<buku> list = new ArrayList<buku>();
        Connection conn = koneksi.koneksiDb();
        Statement st;
        ResultSet rs, rs1, rs2;
        
        //String textHasilSearch = hasilSearchLogin.kolomCari.getText();
        //String textSearch;
        //textSearch = SearchUI2.kolomCari2.;
        //String text = null;
        //if(textHasilSearch != null ){
        //    text = textHasilSearch;
        //} 
        //if (textSearch != null){
        //    text = textSearch;
        //}
        String username = LoginPage.getUsername();
        int id_user = 0;
        
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM `user` WHERE `username` = '"+username+"'");
            while (rs.next()) {
                id_user = rs.getInt("id_user");
            }
            try{
                st = conn.createStatement();
                rs1 = st.executeQuery("SELECT * FROM `riwayat`");
                while (rs1.next()) {
                    if ((rs1.getInt("id_user") == id_user)){    
                        int id_buku = rs1.getInt("id_buku");
                        waktu = rs1.getString("waktu_akses");
                        list_waktu.add(waktu);
                        try {
                            st = conn.createStatement();
                            /*if(textHasilSearch != null /*& textSearch == null){
                                rs = st.executeQuery("SELECT `gambar`, `id_buku`, `judul`, `stok`, `letak` FROM `buku` WHERE `judul` LIKE'%"+textHasilSearch+"%'");
                            }*/ 
                            //if(textSearch != null /*& textHasilSearch == null*/){
                            //    rs = st.executeQuery("SELECT `gambar`, `id_buku`, `judul`, `stok`, `letak` FROM `buku` WHERE `judul` LIKE'%"+textSearch+"%'");
                            //}
                            rs2 = st.executeQuery("SELECT `gambar`, `id_buku`, `judul`, `stok`, `letak` FROM `buku` WHERE `id_buku` = '"+id_buku+"'");

                            buku b;
                            while(rs2.next()){
                                b = new buku(
                                        rs2.getBytes("gambar"),
                                        rs2.getInt("id_buku"),
                                        rs2.getString("judul"),
                                        rs2.getInt("stok"),
                                        rs2.getString("letak")
                                );
                                list.add(b);
                            }
            
                        } catch (SQLException ex) {
                            Logger.getLogger(QueryRiwayat.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                    }
                }
            
            }   catch (SQLException ex) { 
                Logger.getLogger(QueryRiwayat.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }   catch (SQLException ex) {
            Logger.getLogger(QueryRiwayat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return(list);
        
    }

    public static String getWaktu() {
        return waktu;
    }

    public static ArrayList<String> getList_waktu() {
        return list_waktu;
    }
    
    
    
    
}
