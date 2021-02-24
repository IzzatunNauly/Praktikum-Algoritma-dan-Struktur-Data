/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;
public class lingkaranMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
         int r;
         lingkaran a1 = new lingkaran();
         System.out.println("Masukkan jari-jari =");
         r = scan.nextInt();
         a1.hitungLuas();
         a1.hitungKeliling();
    }
}
