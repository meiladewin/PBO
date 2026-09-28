/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum6;

/**
 *
 * @author ASUS
 */
public class MainTugas {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();
        keranjang.tambahProduk(new Buku("Laut Bercerita ", 100000));
        keranjang.tambahProduk(new Elektronik("Headphone", 8000000));
        keranjang.tambahProduk(new Pakaian("Kemeja", 500000));
        keranjang.tampilkanRincian();
        System.out.println("Total setelah diskon: Rp" + keranjang.hitungTotalSetelahDiskon());
    }
}

