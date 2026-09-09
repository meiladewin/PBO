/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Pekerja
        Pekerja pekerja = new Pekerja("Meila Dewin", 19, "Software Engineer", 8000000.0);

        // Menampilkan informasi awal
        System.out.println("=== Informasi Awal ===");
        System.out.println(pekerja.toString());

        // Mengubah nama menggunakan setter
        pekerja.setNama("Meila Dewin Khayarsya, S.Kom");
        System.out.println("\n=== Setelah Nama Diubah ===");
        System.out.println(pekerja.toString());

        // Mencoba akses langsung atribut
        System.out.println("\n=== Uji Akses Langsung ===");

        // System.out.println(pekerja.nama);  // ERROR! nama bersifat private di Manusia
        System.out.println("Usia (protected): " + pekerja.usia);       // BERHASIL, karena Main satu package
        System.out.println("Pekerjaan (public): " + pekerja.pekerjaan); // BERHASIL, public selalu bisa diakses
        // System.out.println(pekerja.gaji);  // ERROR! gaji bersifat private di Pekerja
    }
}