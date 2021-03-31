/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu7;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class mahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        
        PencarianMhs  data = new PencarianMhs();
        int jumMhs =5;
        
        System.out.println("----------------------------------------");
        System.out.println("Masukkan Nim Mahasiswa dari yang terkeci");
        for(int i=0; i<jumMhs; i++){
            System.out.println("===============================");
            System.out.println("NIM\t : ");
            String nama = s1.nextLine();
            System.out.println("UMUR\t : ");
            int nim = s.nextInt();
            System.out.println("NAMA\t : ");
            int umur = s.nextInt();
            System.out.println("IPK\t : ");
            double ipk = s.nextDouble();
            
            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
            
            System.out.println("================================");
            System.out.println("Data keseluruhan mahasiswa");
            data.tampil();
        
        System.out.println("+++++++++++++++++");
        System.out.println("PENCARIAN DATA");
        System.out.println("+++++++++++++++++");
        System.out.println("Masukkan nilai NIM yang dicari");
        System.out.println("NIM\t : ");
        int cari = s.nextInt();
        System.out.println("Menggunakan Sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
        
            System.out.println("+++++++++++++++++++++++++");
            System.out.println("Menggunakan Binary Search");
            posisi = data.FindBinarySearch(cari, 0,jumMhs -1);
            data.tampilPosisi(cari, posisi);
            data.tampilData(cari, posisi);
        }
    }
}
