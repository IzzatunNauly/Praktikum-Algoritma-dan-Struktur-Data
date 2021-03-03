/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_1_sampai_5;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;
public class TanahTerluasMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        System.out.print("Jumlah Tanah: ");
        int j = input.nextInt();
        TanahTerluas[] tnh = new TanahTerluas[j];
        
        for(int i=0;i<j;i++){
            tnh[i] = new TanahTerluas();
            System.out.println("Tanah " + (i+1));
            System.out.print("panjang: ");
            tnh[i].panjang=input.nextInt(); 
            System.out.print("Lebar: ");
            tnh[i].lebar=input.nextInt();
            
            System.out.println("===========================================");
        }
        for(int i=0;i<j;i++){
           
            System.out.println("Luas Tanah : " + tnh[i].hitungLuas());
            System.out.println("--------------------------------------------");
        }
            System.out.println();
             TanahTerluas terluas = new TanahTerluas();
            System.out.println("Tanah Terluas: Tanah " + terluas.tanahTerluas(tnh[0].hitungLuas(),tnh[1].hitungLuas(),tnh[2].hitungLuas()));
    }
}
