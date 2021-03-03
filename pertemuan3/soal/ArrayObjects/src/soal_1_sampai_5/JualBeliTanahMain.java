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
public class JualBeliTanahMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        JualBeliTanah[] jArray = new JualBeliTanah[3];
        
        for(int b =0; b < 3; b++){
            
            jArray[b] = new JualBeliTanah();
            System.out.println("Tanah ke" + (b+1));
            System.out.println("Masukkan Panjang Tanah: ");
            jArray[b].panjang = sc.nextInt();
            System.out.println("Masukkan Lebar Tanah: ");
            jArray[b].lebar = sc.nextInt();
        }
 
        for (int b = 0; b < 3; b++){
            System.out.println("Tanah ke" + (b+1));
            System.out.println("Panjang : " + jArray[b].panjang + ", Lebar : " + jArray[b].lebar);
        }
        
        for (int b = 0; b < 3;b++){
            System.out.println("Luas Tanah ke" + (b+1) + " Adalah: " + jArray[b].luasTanah());
        }
    }
}  

