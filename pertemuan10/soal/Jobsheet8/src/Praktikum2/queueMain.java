/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class queueMain {
    public static void menu(){
        System.out.println("----------------------------");
        System.out.println("Pilih menu");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("-----------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();
        penumpang antri = new penumpang(jumlah);
        
        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            
            switch (pilih){
                    case 1:
                        System.out.println("Nama: ");
                        String nama = sc.nextLine();
                        System.out.println("kota Asal: ");
                        String asal = sc.nextLine();
                        System.out.println("Kota Tujuan: ");
                        String tujuan = sc.nextLine();
                        System.out.println("Jumlah Tiket: ");
                        int jml = sc.nextInt();
                        System.out.println("Harga: ");
                        int hrg = sc.nextInt();
                        penumpang p = new penumpang(nama, asal, tujuan, jml, hrg);
                        sc.nextLine();
                        antri.Enquequ(p);
                        break;
                    case 2:
                        penumpang data = antri.Dequequ();
                        if (! " ".equals(data.nama) && ! " ".equals(data.kotaAsal) && ! " ".equals(data.kotaTujuan)
                        && data.jumlahTiket != 0 && data.harga != 0){
                            System.out.println("Antrian yang keluar: " + data.nama + " " + data.kotaAsal + " " + data.kotaTujuan
                            + " " + data.jumlahTiket + " " + data.harga);
                            break;
                        }
                    case 3:
                       antri.peek();
                       break;
                    case 4:
                        antri.print();
                        break;
        }
    }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
}
}
