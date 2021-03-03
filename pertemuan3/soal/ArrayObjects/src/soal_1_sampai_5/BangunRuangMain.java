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
public class BangunRuangMain {
    public static void main(String[] args) {
        
        bola[] bArray = new bola[1];
        tabung[] tArray = new tabung[1];
        kerucut[] kArray = new kerucut[1];
        
        for (int a = 0; a < 1; a++){
            System.out.println("BOLA");
            bArray[a] = new bola(0);
            System.out.println("KERUCUT");
            tArray[a] = new tabung(0);
            System.out.println("KERUCUT");
            kArray[a] = new kerucut(0);
        }
        
        for (int a = 0; a < 1; a++){
            System.out.println("BOLA");
            System.out.println("Jari-jari Bola: " + bArray[a].jari);
            System.out.println("Volume Bola: " + bArray[a].hitungVolume());
            System.out.println("Luas Permukaan Bola: " + bArray[a].hitungPermukaan());
        }
        
        for (int a = 0; a< 1;a++){
            System.out.println("TABUNG");
            System.out.println("Jari-jari Tabung: " + tArray[a].jari);
            System.out.println("Tinggi Tabung: " + tArray[a].tinggi);
            System.out.println("Volume Tabung: " + tArray[a].hitungVolume());
            System.out.println("Luas Permukaan Tabung: " + tArray[a].hitungPermukaan());
        }
        
        for (int a = 0; a < 1; a++){
            System.out.println("KERUCUT");
            System.out.println("Jari-jari Kerucut: " + kArray[a].jari);
            System.out.println("Tinggi Kerucut: " + kArray[a].tinggi);
            System.out.println("Volume Kerucut: " + kArray[a].hitungVolume());
            System.out.println("Luas Permukaan Kerucut: " + kArray[a].hitungPermukaan());
        }
    }
}
