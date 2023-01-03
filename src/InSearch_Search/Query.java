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

/**
 *
 * @author hamma
 */
public class Query {

    /**
     *
     * @return
     */
    public ArrayList<buku> BindTable(){
        ArrayList<buku> list = new ArrayList<buku>();
        Connection conn = koneksi.koneksiDb();
        Statement st;
        ResultSet rs;
        
        String textHasilSearch = hasilSearch.kolomCari.getText();
        //String textSearch;
        //textSearch = SearchUI2.kolomCari2.;
        String text = null;
        if(textHasilSearch != null ){
            text = textHasilSearch;
        } 
        //if (textSearch != null){
        //    text = textSearch;
        //}
        
        try {
            st = conn.createStatement();
            /*if(textHasilSearch != null /*& textSearch == null){
                rs = st.executeQuery("SELECT `gambar`, `id_buku`, `judul`, `stok`, `letak` FROM `buku` WHERE `judul` LIKE'%"+textHasilSearch+"%'");
            }*/ 
            //if(textSearch != null /*& textHasilSearch == null*/){
            //    rs = st.executeQuery("SELECT `gambar`, `id_buku`, `judul`, `stok`, `letak` FROM `buku` WHERE `judul` LIKE'%"+textSearch+"%'");
            //}
            rs = st.executeQuery("SELECT `gambar`, `id_buku`, `judul`, `stok`, `letak` FROM `buku` WHERE `judul` LIKE'%"+text+"%' OR `kategori` LIKE'%"+text+"%' OR `penulis` LIKE'%"+text+"%' OR `penerbit` LIKE'%"+text+"%'");
            
            buku b;
            while(rs.next()){
                b = new buku(
                        rs.getBytes("gambar"),
                        rs.getInt("id_buku"),
                        rs.getString("judul"),
                        rs.getInt("stok"),
                        rs.getString("letak")
                );
                list.add(b);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
        
        
    }
}
