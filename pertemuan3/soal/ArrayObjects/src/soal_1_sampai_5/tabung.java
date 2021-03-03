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
public class tabung {
    Scanner sc = new Scanner(System.in);
    public double phi = 3.14;
    public double jari;
    public double tinggi;
    
    public tabung(double r, double t){
        System.out.println("Masukkan Jari-jari: ");
        r = sc.nextDouble();
        System.out.println("Masukkan Tinggi");
        t = sc.nextDouble();
        jari = r;
        tinggi = t;
    }

    tabung(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    double hitungVolume(){
        double v = phi * jari * jari * tinggi;
        return v;
    }
    
    double hitungPermukaan(){
        double p = 2 * jari * tinggi * (jari + tinggi);
        return p;
    }
}
