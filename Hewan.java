/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author acer
 */
class Hewan {
    String nama;
    String jenis;
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama + ", Jenis: " + jenis);
    }
}
class Kucing extends Hewan {
    public void bersuara() {
        System.out.println("Kucing bersuara: Meong!");
    }
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        bersuara();
    }
}
class Anjing extends Hewan {
    public void bersuara() {
        System.out.println("Anjing bersuara: Guk guk!");
    }
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        bersuara();
    }
}

