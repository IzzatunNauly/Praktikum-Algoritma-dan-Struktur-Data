/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu3;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;
public class PersegiPanjangMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        PersegiPanjang[] ppArray = new PersegiPanjang[3];
        
        for(int i =0; i < 3; i++){
            
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.println("Masukkan Panjang : ");
            ppArray[i].panjang = sc.nextInt();
            System.out.println("Masukkan Lebar : ");
            ppArray[i].lebar = sc.nextInt();
        }
 
        for (int i = 0; i < 3; i++){
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang : " + ppArray[i].panjang + ", Lebar : " + ppArray[i].lebar);
        }
    }
}
