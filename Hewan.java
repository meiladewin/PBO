/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author ASUS
 */
public class Hewan {
    public void bersuara() {
        System.out.println("Hewan bersuara");
    }
    // Overloading versi 1: satu parameter
    public void makan(String makanan) {
        System.out.println("Hewan makan " + makanan);
    }
    // Overloading versi 2: dua parameter
    public void makan(String makanan, int jumlah) {
        System.out.println("Hewan makan " + jumlah + " porsi " + makanan);
    }
}

