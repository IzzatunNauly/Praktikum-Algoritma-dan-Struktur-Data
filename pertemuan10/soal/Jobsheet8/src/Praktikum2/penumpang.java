/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *
 * @author lenovo
 */
public class penumpang {
    String nama, kotaAsal, kotaTujuan;
    int jumlahTiket,harga;
    
    penumpang (String nama, String kotaAsal, String kotaTujuan, int jml, int harga){
        this.nama = nama;
        this.kotaAsal = kotaAsal;
        this.kotaTujuan = kotaTujuan;
        jumlahTiket = jml;
        this.harga = harga;
    }
    int front;
    int rear;
    int size;
    int max;
    penumpang[] q;
    
    public penumpang(int max){
        this.max = max;
        create();
    }
    
    public void create(){
        q = new penumpang[max];
        size = 0;
        front = rear = -1;
    }
    public boolean IsEmpty(){
        if (size == 0){
            return true;
        }else{
            return false;
        }
    }
    public boolean IsFull(){
        if (size == max){
            return true;
        }else{
            return false;
        }
    }
    public void peek(){
        if(!IsEmpty()){
            System.out.println("Elemen Terdepan: " + q[front].nama + " " + q[front].kotaAsal + " " + q[front].kotaTujuan
             + " " + q[front].jumlahTiket + " " + q[front].harga);
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    public void print(){
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        }else{
            int i = front;
            while (i != rear){
                System.out.println(q[i].nama + " " + q[i].kotaAsal + " " + q[i].kotaTujuan + " " + 
                q[i].jumlahTiket + " " + q[i].harga + " ");
                i = (i+1) % max;
                System.out.println(" ");
            }
            System.out.println(q[i] + " ");
            System.out.println("Jumlah Elemen: " + size);
        }
    }
    public void clear(){
        if (!IsEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    public void Enquequ(penumpang data){
        if(IsFull()){
            System.out.println("Queue sudah penuh");
        }else{
            if (IsEmpty()){
                front = rear = 0;
            }else{
                {if(rear == max -1){
                    rear = 0;
                }else{
                    rear++;
                }
            }
            q[rear] = data;
            size++;
            }
        }
    }
    public penumpang Dequequ(){
        penumpang data = new penumpang(" ", " ", " ", 0, 0);
        if(IsEmpty()){
            System.out.println("Queque masih kosong");
        }else{
            data = q[front];
            size--;
            if(IsEmpty()){
                front = rear = -1;
            }else{
                if (front == max -1){
                    front = 0;
                }else{
                    front++;
                }
            }
        }
        return data;
    }
}

