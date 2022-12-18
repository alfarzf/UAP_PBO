/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uap;

/**
 *
 * @author acer
 */
public class Makanan extends Produk{
    private int id;
    private int daya_tahan;

    public Makanan(int id, int daya_tahan, String nama_produk, double harga, int jumlah, double diskon) {
        super(nama_produk, harga, jumlah, diskon);
        this.id = id;
        this.daya_tahan = daya_tahan;
    }

    public Makanan(int id, String nama_produk) {
        super(nama_produk);
        this.id = id;
    }

    public Makanan(String nama_produk, double harga) {
        super(nama_produk, harga);
    }

    public Makanan(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDaya_tahan() {
        return daya_tahan;
    }

    public void setDaya_tahan(int daya_tahan) {
        this.daya_tahan = daya_tahan;
    }
    
}
