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
public class nomor2 {
    String tanggal;
    int noTransaksi,jumlah,totalHargaByr;
    
     nomor2(int no, String tanggal, int jumlah, int hrg){
        noTransaksi = no;
        this.tanggal = tanggal;
        this.jumlah = jumlah;
        totalHargaByr = hrg;
    }
    int size;
    int top;
    nomor2 data[];
    
    public nomor2(int size){
        this.size = size;
        data = new nomor2[size];
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
   public void push(nomor2 st) {
       if (!IsFull()){
           top++;
           data[top] = st;
       }else{
           System.out.println("Isi Stack penuh");
       }
   }
   public void pop(){
       if (!IsEmpty()){
           nomor2 x = data[top];
           top--;
           System.out.println("Data yang Keluar: " + x.noTransaksi + " " + x.tanggal + " "+ x.jumlah
           + " " + x.totalHargaByr);
       }else{
           System.out.println("Stack masih kosong");
       }
   }
   public void peek(){
       System.out.println("Elemen teratas: " + data[top].noTransaksi + " "+ data[top].tanggal+ " " + data[top].jumlah
       + " " + data[top].totalHargaByr);
   }
   public void print(){
       System.out.println("Isi stack:");
       for (int i = top; i >= 0; i--){
           System.out.println(data[i].noTransaksi + " "+data[i].tanggal+ " " + data[i].jumlah+ " "
          + data[i].totalHargaByr);
       }
       System.out.println("");
   }
}
