/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class queueMain {
    public static void menu(){
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("----------------------------------");
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Masukkan kapasitas queue: ");
         int n = sc.nextInt();
         queue q = new queue(n);
         
         int pilih;
         do{
             menu();
             pilih = sc.nextInt();
             switch(pilih){
                 case 1:
                     System.out.println("Masukkan data baru: ");
                     int dataMasuk = sc.nextInt();
                     q.Enquequ(dataMasuk);
                     break;
                 case 2:
                     int dataKeluar = q.Dequequ();
                     if (dataKeluar != 0){
                         System.out.println("Data yang dikeluarkan: " + dataKeluar);
                         break;
                     }
                 case 3:
                     q.print();
                     break;
                 case 4:
                     q.peek();
                     break;
                 case 5:
                     q.clear();
                     break;
             }
         }
         while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
