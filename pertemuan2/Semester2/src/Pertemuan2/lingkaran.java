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
public class lingkaran {
     double r;
     double luas;
     double keliling;
     
     double hitungLuas(){
        luas= 3.14*r*r;  
         System.out.println("luas lingkaran =" + luas);
        return luas;
     }
     
     double hitungKeliling(){
         keliling = 2*3.14*r;
         System.out.println("keliling lingkaran =" + keliling);
         return keliling;
     }
     
}
