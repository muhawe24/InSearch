/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InSearch_Search;

/**
 *
 * @author hamma
 */
public class buku {
    private int id_buku;
    private byte[] image;
    private String judul;
    private String noISBN;
    private String penulis;
    private String penerbit;
    private int tahun;
    private String kategori;
    private String bahasa;
    private int halaman;
    private String deskripsi;
    private int stok;
    private String letak;

    public buku() {
    }

    public buku(int id_buku, byte[] image, String judul, String noISBN, String penulis, String penerbit, int tahun, String kategori, String bahasa, int halaman, String deskripsi, int stok, String letak) {
        this.id_buku = id_buku;
        this.image = image;
        this.judul = judul;
        this.noISBN = noISBN;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.tahun = tahun;
        this.kategori = kategori;
        this.bahasa = bahasa;
        this.halaman = halaman;
        this.deskripsi = deskripsi;
        this.stok = stok;
        this.letak = letak;
    }

    public buku(byte[] image, int id_buku, String judul, int stok, String letak) {
        this.id_buku = id_buku;
        this.image = image;
        this.judul = judul;
        this.stok = stok;
        this.letak = letak;
    }
    
    

    public int getId_buku() {
        return id_buku;
    }

    public void setId_buku(int id_buku) {
        this.id_buku = id_buku;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getNoISBN() {
        return noISBN;
    }

    public void setNoISBN(String noISBN) {
        this.noISBN = noISBN;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getBahasa() {
        return bahasa;
    }

    public void setBahasa(String bahasa) {
        this.bahasa = bahasa;
    }

    public int getHalaman() {
        return halaman;
    }

    public void setHalaman(int halaman) {
        this.halaman = halaman;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getLetak() {
        return letak;
    }

    public void setLetak(String letak) {
        this.letak = letak;
    }
    
    
    
}
