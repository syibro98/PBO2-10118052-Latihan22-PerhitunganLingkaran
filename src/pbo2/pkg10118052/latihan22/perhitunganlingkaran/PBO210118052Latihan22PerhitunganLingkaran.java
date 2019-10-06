/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118052.latihan22.perhitunganlingkaran;

import java.util.Scanner;
/**
 * @author 
 * NAMA      : Bagus Syibro Malisi
 * KELAS     : PBO2
 * NIM       : 10118052
 * Deskripsi Program : Program ini bertujuan untuk menghitung sebuah lingkaran 
 * 
 */
public class PBO210118052Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("========== Perhitungan Lingkaran ==========");
        
        boolean success = false;
        
        while(!success) {
            System.out.print("Masukan nilai diameter lingkaran : ");

            if(!scanner.hasNextDouble()) {
                System.out.println("Nilai Diameter Tidak Sesuai");
                scanner.next();
                System.out.println();
                continue;
            }
            
            success = true;
        }
        
        double diameter = scanner.nextDouble();
        double jariJari = diameter/2;
        double keliling = 3.14*diameter;
        double luas = 3.14*(jariJari*jariJari);
        
        System.out.println();
        System.out.println("========== Hasil Perhitungan Lingkaran ==========");
        System.out.println("Jari-jari Lingkaran = " + jariJari + " cm");
        System.out.println("Luas Lingkaran = " + luas + " cm");
        System.out.println("Keliling Lingkaran = " + keliling + " cm");
    }
    
}
