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
public class leagueMain {
    public static void main(String[] args) {
        primerLeagueService cek = new primerLeagueService();
        premierLeague t1 = new premierLeague("Liverpool", 29, 45, 82);              premierLeague t10 = new premierLeague("Burnley", 29, -6, 39);
        premierLeague t2 = new premierLeague("Manchester City", 27, 39, 57);        premierLeague t11 = new premierLeague("Crystal palace", 29, -6, 39);
        premierLeague t3 = new premierLeague("Leicester", 28, 26, 50);              premierLeague t12 = new premierLeague("Everton", 29, -6, 37);
        premierLeague t4 = new premierLeague("Chelsea", 29, 9, 48);                 premierLeague t13 = new premierLeague("Newcastle United", 29, -16, 35);
        premierLeague t5 = new premierLeague("Wolverhampton Wanderes", 29, 7, 43);  premierLeague t14 = new premierLeague("Southampton", 29, -17, 34);
        premierLeague t6 = new premierLeague("Sheffield United", 28, 5, 43);        premierLeague t15 = new premierLeague("Brighton & Hove Albion", 29, -8, 29);
        premierLeague t7 = new premierLeague("Manchester United",28, 45, 82);       premierLeague t16 = new premierLeague("West Ham United", 29, -15, 27);
        premierLeague t8 = new premierLeague("Tottenham Hotspur", 29, 7, 41);       premierLeague t17 = new premierLeague("Watford", 29, -17, 27);
        premierLeague t9 = new premierLeague("Arsenal", 28, 4, 40);                 premierLeague t18 = new premierLeague("AFC Bournemouth", 29, -18, 27);
        premierLeague t19 = new premierLeague("Aston Villa", 27, -18, 25);          premierLeague t20 = new premierLeague("Norwich City", 29, -27, 21);
        
        cek.tambah(t1);
        cek.tambah(t2);
        cek.tambah(t3);
        cek.tambah(t4);
        cek.tambah(t5);
        cek.tambah(t6);
        cek.tambah(t7);
        cek.tambah(t8);
        cek.tambah(t9);
        cek.tambah(t10);
        cek.tambah(t11);
        cek.tambah(t12);
        cek.tambah(t13);
        cek.tambah(t14);
        cek.tambah(t15);
        cek.tambah(t16);
        cek.tambah(t17);
        cek.tambah(t18);
        cek.tambah(t19);
        cek.tambah(t20);
        
        
        
        System.out.println("Data Premier league setelah sorting ");
        cek.insertionSort(true);
        cek.tampil();
        
    }
}
