/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author lenovo
 */
public class BinaryTreeArray {
    int[] data;
    int idxlast;
    
    public BinaryTreeArray(){
        data = new int[10];
    }
    
    void populateData(int[] data, int idxlast){
        this.data = data;
        this.idxlast = idxlast;
    }
    
    void traverseInOrder(int idxStart){
        if(idxStart <= idxlast){
            traverseInOrder(2*idxStart+1);
            System.out.println( data[idxStart]+ " ");
            traverseInOrder(2*idxStart+2);
        }
    }
}
