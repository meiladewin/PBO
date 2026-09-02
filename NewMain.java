/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspbo3;

/**
 *
 * @author acer
 */
public class NewMain {
    public static void main (String[] args) {
        Mobil car1 = new Mobil("Porsche", "Prsc 911", 2013, "Merah");
        Mobil car2 = new Mobil("Mercedes", "Mercedes-AMG SL 63", 2022, "Red");
        Mobil car3 = new Mobil("Mazda", "Mazda 3 Hatchback", 2022, "Black");

        car1.displayInfo(1);
        car2.displayInfo(2);
        car3.displayInfo(3);

        car2.gantiWarna("Grey", 1);
        car2.displayInfo(1);
    }
    
}
