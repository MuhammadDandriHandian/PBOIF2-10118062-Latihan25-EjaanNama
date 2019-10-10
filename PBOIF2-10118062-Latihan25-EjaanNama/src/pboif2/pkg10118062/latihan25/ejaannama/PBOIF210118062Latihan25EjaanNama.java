/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118062.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PBOIF210118062Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukan nama depan anda untuk di eja :");
        Scanner scanner = new Scanner(System.in);
        String nama = scanner.next();
        
        System.out.println("Ejaan untuk " + "'" + nama + "'" + " adalah :");
        
        for (int a=1; a<=nama.length(); a++){
            System.out.println("Huruf ke-" + a + nama.substring(a-1,a));
    }
    
}
}