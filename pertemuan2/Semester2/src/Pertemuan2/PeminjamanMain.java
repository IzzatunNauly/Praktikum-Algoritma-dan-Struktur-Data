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
public class PeminjamanMain {
    public static void main(String[] args) {
        
        Peminjaman a1 = new Peminjaman();
        a1.namaMember = "Aurora";
        a1.namaGame = "Free Fire";
        a1.lamaPinjam = 2;
        a1.hargaSewa = 120000;
        
        a1.dataHasilPinjaman();
        int hargaTotal = a1.hargaBayar(5);
        System.out.println("Harga sewa dalam 5 hari =" + hargaTotal);
        
    }
}
