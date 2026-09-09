/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author acer
 */
public class Pekerja extends Manusia {
    private double gaji; // private

    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan); // memanggil constructor Manusia
        this.gaji = gaji;
    }

    // Getter untuk gaji
    public double getGaji() {
        return gaji;
    }

    // Setter untuk gaji
    public void setGaji(double gaji) {
        if (gaji < 0) {
            throw new IllegalArgumentException("Gaji tidak boleh negatif");
        }
        this.gaji = gaji;
    }

    @Override
    public String toString() {
        return "Nama: " + getNama() +              // pakai getter karena nama private
               ", Usia: " + usia +                   // langsung, karena protected
               ", Pekerjaan: " + pekerjaan +          // langsung, karena public
               ", Gaji: Rp" + String.format("%,.2f", gaji);
    }
}

