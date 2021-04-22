/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author lenovo
 */
public class queue {
    public int max;
    public int size;
    public int front;
    public int rear;
    public int[] q;
    
    public queue(int max){
        this.max = max;
        create();
    }
    public void create(){
        q = new int[max];
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
            System.out.println("Elemen Terdepan: " + q[front]);
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
                System.out.println(q[i] + " ");
                i = (i+1) % max;
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
    public void Enquequ(int data){
        if(IsFull()){
            System.out.println("Queue sudah penuh");
        }else{
            if(rear == max -1){
                rear = 0;
            }else{
                rear++;
            }
        }
        q[rear] = data;
        size++;
    }
    public int Dequequ(){
        int data = 0;
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
    public void peekPosition(int data){
        
    }
    public void peekAt(int position){
        
    }
}
