/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas;

/**
 *
 * @author LENOVO
 */

public class MainHewan {
    public static void main(String[] args) {
        // Membuat objek kucing dari kelas Kucing dengan nama "Miko"
        Kucing kucing = new Kucing("Giyu");
        kucing.tampilkanInfo();

        // Memberikan baris kosong pada output
        System.out.println();

        // Membuat objek anjing dari kelas Anjing dengan nama "Vasko"
        Anjing anjing = new Anjing("Blacky");
        anjing.tampilkanInfo();
    }
}

