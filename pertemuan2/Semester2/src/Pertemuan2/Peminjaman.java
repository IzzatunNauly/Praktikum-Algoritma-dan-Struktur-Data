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
public class Peminjaman {
        int id;
        String namaMember;
        String namaGame;
        int lamaPinjam;
        int hargaSewa;
    
        void dataHasilPinjaman(){
            System.out.println("Nama Member = " + namaMember);
            System.out.println("Nama Game = " + namaGame);
            System.out.println("Lama Peminjaman = " + lamaPinjam);
            System.out.println("Harga Sewa = " + hargaSewa);
        }
        
        int hargaBayar(int hari){
            return hari * hargaSewa;
        }
}
 