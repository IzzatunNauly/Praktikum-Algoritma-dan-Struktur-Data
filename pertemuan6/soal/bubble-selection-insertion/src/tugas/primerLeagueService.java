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
public class primerLeagueService {
    premierLeague[] leagues = new premierLeague[20];
    public int ind;
    
    public void tambah(premierLeague t){
        if(ind<leagues.length){
            leagues[ind] = t;
            ind++;
        }else{
            System.out.println("Maaf Tidak Tersedia!!");
        }
    }
    public void tampil(){
       
        for(premierLeague t : leagues){
            t.tampil();
            System.out.println("------------------------------------");
        }
    }
    public void insertionSort(boolean asc){
        for(int i=1; i<leagues.length; i++){
            premierLeague temp = leagues[i];
            int j=i;
            if (asc){
           }else{
                
            }
            leagues[j] = temp;
            
    }
        System.out.println("====================================");
}
}
