/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
public class KeranjangBelanja {
    private ArrayList<Produk> daftarProduk = new ArrayList<>();
    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }
    public double hitungTotalSetelahDiskon() {
        double total = 0;
        for (Produk p : daftarProduk) {
            total += p.getHargaSetelahDiskon(); // polimorfisme
        }
        return total;
    }
    public void tampilkanRincian() {
        for (Produk p : daftarProduk) {
            System.out.println(p.getNama()
                    + " | Harga: Rp" + p.getHarga()
                    + " | Diskon: Rp" + p.hitungDiskon()
                    + " | Setelah diskon: Rp" + p.getHargaSetelahDiskon());
        }
    }
}

