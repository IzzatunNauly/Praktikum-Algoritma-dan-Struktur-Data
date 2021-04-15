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
public class nomor1 {
    int size;
    int top;
    int data[];
    
    public nomor1(int size){
        this.size = size;
        data = new int[size];
        top = -1;
    }
    public boolean IsEmpty(){
        if(top == -1){
            return true;
        }else {
            return false;
        }
    }
    public boolean IsFull(){
        if (top == size - 1){
            return true;
        }else {
            return false;
        }
    }
   public void push(int dt) {
       if (!IsFull()){
           top++;
           data[top] = dt;
       }else{
           System.out.println("Isi Stack penuh");
       }
   }
   public void pop(){
       if (!IsEmpty()){
           int x = data[top];
           top--;
           System.out.println("Data yang Keluar: " + x);
       }else{
           System.out.println("Stack masih kosong");
       }
   }
}
