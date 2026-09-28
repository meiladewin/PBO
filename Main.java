/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum6;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hewan kucing = new Hewan();
        kucing.bersuara();          // memanggil bersuara() dari Hewan
        kucing.makan("ikan");       // memanggil makan(String)
        kucing.makan("ikan", 2);    // memanggil makan(String, int)
    }
}  
    