/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;
import java.util.Stack;
import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class nomor1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack tumpukan = new Stack();
        String kalimat;
        System.out.print("Masukkan kalimat:");
        kalimat = sc.nextLine();
        for (int i = 0; i < kalimat.length(); i++){
            tumpukan.push(new Character(kalimat.charAt(i)));
        }
        System.out.println("Hasil: ");
        while (!tumpukan.empty()){
            Object elemen = tumpukan.pop();
            System.out.print(elemen);
           
        }
        System.out.println("");
    }
}
