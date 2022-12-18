/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uap;

import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class Barang extends Produk{
    private String barcode;
    private String expired;
    private ArrayList<Kategori> kategori=new ArrayList<>();

    public Barang() {
    }

    public Barang(String barcode) {
        this.barcode = barcode;
    }
    
//    public Barang(String nama_produk) {
//        super(nama_produk);
//    }

    public Barang(String nama_produk, double harga) {
        super(nama_produk, harga);
    }
    public Barang(String barcode, String nama_produk, double harga, int jumlah, double diskon) {
        super(nama_produk, harga, jumlah, diskon);
        this.barcode = barcode;
    }
    
//    public Barang(String barcode, String expired) {
//        this.barcode = barcode;
//        this.expired = expired;
//    }
    public Barang(String barcode, String expired, String nama_produk, double harga, int jumlah, double diskon) {
        super(nama_produk, harga, jumlah, diskon);
        this.barcode = barcode;
        this.expired = expired;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getExpired() {
        return expired;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }

    public ArrayList<Kategori> getKategori() {
        return kategori;
    }

    public void setKategori(ArrayList<Kategori> kategori) {
        this.kategori = kategori;
    }
    public boolean isExpired(){
        return true;
    }
    public void addKategori(Kategori k){
        kategori.add(k);
    }
}
