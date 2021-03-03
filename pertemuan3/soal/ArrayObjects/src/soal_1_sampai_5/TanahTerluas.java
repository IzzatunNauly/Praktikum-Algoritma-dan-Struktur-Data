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
public class TanahTerluas {
    public int panjang;
    public int lebar;
    public int maksimum=0;
    
    public TanahTerluas(){
        
    }
    
    public int hitungLuas(){
        return panjang*lebar;
    }
    
    public int tanahTerluas(int a, int b, int c){
        if(a>b && a>c){
            return 1;
        }else if(b>a && b>c){
            return 2;
        }else{
            return 3;
        }
           
         }
        
}
