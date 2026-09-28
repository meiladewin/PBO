/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum6;

/**
 *
 * @author ASUS
 */
public class NewMain {
    public static void main(String[] args) {
        // Referensi bertipe Hewan, tetapi objek aslinya Kucing
        Hewan hewan = new Kucing();
        hewan.bersuara();                 // Output: Meow
        Kucing kucing = new Kucing();
        kucing.makan("ikan");             // makan() warisan dari Hewan
        kucing.makan("ikan", 2);          // makan() versi overloading
        Anjing anjing = new Anjing();
        anjing.bersuara();                // Output: Woof
        anjing.makan("daging", 3);        // makan() versi overloading
    }
}
