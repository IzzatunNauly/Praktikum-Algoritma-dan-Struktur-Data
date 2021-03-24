/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author lenovo
 */
public class tiketMain {
    public static void main(String[] args) {
        tiketService list = new tiketService();
        tiket t1 = new tiket("Garuda Indonesia", 1418700, "Jakarta", "surabaya");
        tiket t2 = new tiket("Lion Air", 472800, "Surabaya", "Jakarta");
        tiket t3 = new tiket("Wing Air",644000, "Surabaya", "Denpasar");
        tiket t4 = new tiket("Sriwijaya Air", 421000, "Jakarta", "surabaya");
        tiket t5 = new tiket("Kal Star", 613000, "Denpasar", "surabaya");
        tiket t6 = new tiket("Express Air", 416000, "Medan", "Yogyakarta");
        tiket t7 = new tiket("Citilink", 732500, "Medan", "Bandung");
        tiket t8 = new tiket("Transnusa", 674200, "Solo", "Palembang");
        tiket t9 = new tiket("Batik Air", 1084300, "Manokwari", "surabaya");
        tiket t10 = new tiket("Air Asia", 1170000, "Lampung", "Yogyakarta");
        tiket t11 = new tiket("Sky Aviation",655600 , "Manokwari", "surabaya");
        
        list.tambah(t1);
        list.tambah(t2);
        list.tambah(t3);
        list.tambah(t4);
        list.tambah(t5);
        list.tambah(t6);
        list.tambah(t7);
        list.tambah(t8);
        list.tambah(t9);
        list.tambah(t10);
        list.tambah(t11);
        
        System.out.println("Daftar Tiket Pesawat sebelum di Sorting");
        list.tampil();
        
        System.out.println("Daftar Tiket Pesawat Setelah di Sorting");
        list.bubbleSort();
        list.tampil();
        
        System.out.println("Daftar Tiket Pesawat Setelah Di sorting ");
        list.selectionSort();
        list.tampil();
    }
}
