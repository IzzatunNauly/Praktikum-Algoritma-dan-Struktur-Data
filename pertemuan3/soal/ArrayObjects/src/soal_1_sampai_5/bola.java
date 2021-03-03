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
public class bola {
    Scanner sc = new Scanner(System.in);
    public double phi = 3.14;
    public double jari;
    
    public bola(double r){
        System.out.println("Masukkan Jari-Jari: ");
        r = sc.nextDouble();
        jari = r;
    }
    
    double hitungVolume(){
        double v = 4/3 * phi * jari * jari * jari;
        return v;
    }
    
    double hitungPermukaan(){
        double p = 4 * phi * jari * jari;
        return p;
    }
    
}
