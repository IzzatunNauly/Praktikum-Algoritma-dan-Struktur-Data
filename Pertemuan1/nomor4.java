import java.util.Scanner;
public class nomor4 {
    public static void main(String[] args){
        int pilih;
        Scanner x = new Scanner(System.in);
        do {
            System.out.println("Proses Hitung Luas Segitiga, Luas Persegi Panjang, dan Luas Lingkaran");
            System.out.println("1. Hitung Luas Segitiga");
            System.out.println("2. Hitung Luas Persegi Panjang");
            System.out.println("3. Hitung Luas Lingkaran");
            System.out.println("4. Keluar");
            System.out.print("Masukkan Pilihan anda (1-4) = ");
            pilih=x.nextInt();

        if(pilih==1){
            Objeksegitiga A=new Objeksegitiga();
            A.Proses1();
        }else if (pilih==2){
            Objeksegitiga B=new Objeksegitiga();
            B.Proses2();
        }else if (pilih==3){
            Objeksegitiga C=new Objeksegitiga();
            C.Proses3();
        }
               
            } while (pilih>0 && pilih<4);
    }
}
    
public class Objeksegitiga {
    public void Proses1(){
        Scanner input1 = new Scanner(System.in);
            double alas, tinggi, luassegitiga;
        
            System.out.println("____________________________");
            System.out.println("Program Hitung Luas Segitiga");
            System.out.println("____________________________");
            System.out.print("Alas              =  ");
            alas = input1.nextDouble();
       
            System.out.print("Tinggi            =  ");
            tinggi = input1.nextDouble();

            luassegitiga = (alas * 0.5)*tinggi;
            System.out.println("Luas Lingkaran    = " +luassegitiga);
        }
    public void Proses2(){
        Scanner input2 = new Scanner(System.in);
            double panjang, lebar, luaspersegi;
            
            System.out.println("____________________________");
            System.out.println("Program Hitung Luas Persegi Panjang");
            System.out.println("___________________________________");
            System.out.print("Panjang           =  ");
            panjang = input2.nextDouble();

            System.out.print("Lebar             =  ");
            lebar = input2.nextDouble();

            luaspersegi = panjang * lebar;
            System.out.println("Luas Persegi Panjang    = " +luaspersegi);
        }
    public void Proses3(){
        Scanner input3 = new Scanner(System.in);
            double phi = 3.14;
            double r;
            double luaslingkaran;
            
            System.out.println("____________________________");
            System.out.println("Program Hitung Luas Lingkaran");
            System.out.println("_____________________________");
            System.out.print("Jari-jari Lingkaran   =  ");
            r = input3.nextDouble();

            luaslingkaran = phi * r * r;
            System.out.println("Luas Lingkaran      = " +luaslingkaran);
        }
}