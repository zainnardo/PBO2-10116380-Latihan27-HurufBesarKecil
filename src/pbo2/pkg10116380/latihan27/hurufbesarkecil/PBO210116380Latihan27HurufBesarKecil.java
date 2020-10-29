/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 * NAMA: Zain Achamd Rizqullah
 * KELAS: PBO2
 * NIM: 10116380
 * Deskripsi: Program huruf Besar dan Kecil
 */
public class PBO210116380Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String lol ;
        
        System.out.print("Masukkan Kalimat : " );
        
        Scanner huruf = new Scanner(System.in);
        lol = huruf.nextLine();
        
        System.out.println();
        System.out.println("===========Hasil Formating============");
        System.out.println("Huruf Besar\t: " + lol.toUpperCase());
        System.out.println("Huruf Kecil\t: " + lol.toLowerCase());
        
    }
    
}
