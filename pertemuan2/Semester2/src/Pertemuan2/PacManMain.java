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
public class PacManMain {
    static PacMan pacMan = new PacMan();
    public static void main(String[] args) {
        lapangan();
    }
    static void lapangan(){
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan Tinggi: ");
        PacMan.height = in.nextInt();
        System.out.println("Masukkan Lebar");
        PacMan.width = in.nextInt();
        PacMan.x = 0;
        PacMan.y = 0;
        pacMan.printPosition();
        
        pilih();
    }
    static void pilih(){
        Scanner in = new Scanner(System.in);
        System.out.println("Langkah PacMan : ");
        System.out.println("1. Move Left : ");
        System.out.println("2. Move Right : ");
        System.out.println("3. Move Up");
        System.out.println("4. Move Down");
        System.out.println("Pilih Langkah");
        
        int pilih = in.nextInt();
        if(pilih == 1){
            pacMan.moveLeft();
        }else if(pilih == 2){
            pacMan.moveRight();
        }else if (pilih == 3){
            pacMan.moveUp();
        }else if (pilih == 4){
            pacMan.moveDown();
        }else{
            System.out.println("Maaf Tidak ditemukan");
        }
    }
    
}
