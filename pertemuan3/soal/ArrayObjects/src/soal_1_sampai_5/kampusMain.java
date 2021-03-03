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
public class kampusMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        kampus[] kArray = new kampus[3];
        
        for(int c =0; c < 3; c++){
            
            kArray[c] = new kampus();
            System.out.println("Data Mahasiswa ke" + (c+1));
            System.out.println("Masukkan Nama Mahasiswa: ");
            kArray[c].nama = sc.nextLine();
            System.out.println("Masukkan NIM Mahasiswa: ");
            kArray[c].nim = sc.nextInt();
            System.out.println("Masukkan Jenis Kelamin (P or L): ");
            kArray[c].kelamin = sc.nextLine();
            System.out.println("Masukkan IPK Mahasiswa: ");
            kArray[c].ipk = sc.nextDouble();
        }
        
        for (int c = 0; c < 3; c++){
            System.out.println("===========================================================");
            System.out.println("Nama Mahasiswa =" + kArray[c].nama);
            System.out.println("NIM Mahasiswa = " + kArray[c].nim);
            System.out.println("Jenis Kelamin Mahasiswa =" + kArray[c].kelamin);
            System.out.println("ipk Mahasiswa =" + kArray[c].ipk);
            System.out.println("===========================================================");
        }
    }
}
