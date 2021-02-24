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
public class Barang {
        
        String nama;
        int hargaSatuan;
        int jumlah;
        int total;
        int diskon;
        int bayar;
        
        int hitungHargaTotal(){
           total = hargaSatuan * jumlah;
           return total;
        }
        int hitungDiskon(){
            if (total > 100000) {
                diskon = (int) (total * 0.1);
                System.out.println("Jadi yang harus dibayar adalah " + diskon); 
                System.out.println("Selamat Anda mendapatkan diskon 10%");
            }
            else if (total >= 100000){
                diskon = (int) (total * 0.05);
                System.out.println("jadi yang harus dibayar adalah " + diskon);
                System.out.println("Selamat Anda mendapatkan diskon 5%");
            }
            else{
                System.out.println("Maaf anda belum mendapatkan diskon");
            }
            return diskon;
        }
        
        int hitungHargaBayar(){
            bayar = total - diskon;
                System.out.println("Belanja yang harus Dibayar" + bayar );
            return bayar;
        }
}
