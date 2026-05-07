/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author Rafi Kamaly
 */
public class Latihan1 {
    
    static abstract class Kendaraan {

        public void nyalaMesin() {
            System.out.println("Mesin dinyalakan");
        }

        public abstract void berjalan();
    }

    static class Motor extends Kendaraan {

        @Override
        public void berjalan() {
            System.out.println("Motor berjalan dengan 2 roda");
        }
    }

    public static void main(String[] args) {
        Motor m = new Motor();
        m.nyalaMesin();
        m.berjalan();
    }
    
}
