/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu7;

/**
 *
 * @author lenovo
 */
public class PencarianMhs {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;
    
    void tambah(Mahasiswa m){
        if (idx<listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!!");
        }
    }
    void tampil(){
        for (Mahasiswa m: listMhs){
            m.tampil();
            System.out.println("-----------------------");
        }
    }
    public int FindSeqSearch(int cari){
        int posisi = -1;
        for(int j = 0; j<listMhs.length; j++){
            if(listMhs[j].nim== cari){
                posisi =j;
                break;
            }
        }
        return posisi;
    }
    public void tampilPosisi(int x, int pos){
        if (pos != -1){
            System.out.println("data: "+x+"ditemukan pada index: "+pos);
        }else{
            System.out.println("data: "+x+"tidak ditemukan!!!");
        }
    }
    public void tampilData(int x, int pos){
        if(pos != -1){
            System.out.println("NIM\t : "+ x);
            System.out.println("NAMA\t : "+ listMhs[pos].nama);
            System.out.println("UMUR\t : "+ listMhs[pos].umur);
            System.out.println("IPK\t : "+ listMhs[pos].ipk);
        }else{
            System.out.println("Data "+x+"Tidak ditemukan");
        }
    }
    public int FindBinarySearch(int cari,int left, int right){
        int mid;
        if (right >= left){
            mid = (right + left)/2;
            if (cari == listMhs[mid].nim){
                return mid;
            }else if(listMhs[mid].nim > cari){
                return FindBinarySearch(cari, left, mid - 1);
            }else{
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}
