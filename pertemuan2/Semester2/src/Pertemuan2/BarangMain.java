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
public class BarangMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int harga;
        int jumlah;
        Barang c1 = new Barang();
        
        System.out.println("Masukkan harga yang Dibeli:");
        harga = scan.nextInt();
        System.out.println("Maukkan Jumlah yang Dibeli:");
        jumlah = scan.nextInt();
        c1.hitungHargaTotal();
        c1.hitungDiskon();
        c1.hitungHargaBayar();
        
    }
}
