import java.util.Scanner;
public class nomor4 {
        static Scanner sc = new Scanner(System.in);
        
        static int menuUtama(){
        int menu;
        System.out.println("==========================================================================");
        System.out.println("\t\t\t         MENU UTAMA");
        System.out.println("==========================================================================");
        System.out.println("1. Menghitung luas segitiga ");
        System.out.println("2. Menghitung luas persegi panjang");
        System.out.println("3. Menghitung luas lingkaran");
        System.out.println("==========================================================================");
        System.out.print("Pilih Menu \t\t: ");
        menu = sc.nextInt();
        return menu;
        }
        
        static double luasSegitiga(int alas, int tinggi){
        double luas = (alas * tinggi)/2;
        return luas;
        }
        
        static int luasPersegiPanjang(int panjang, int lebar){
        int luas = panjang * lebar;
        return luas;
        }
        
        static double luasLingkaran(double phi, int r){
        double luas = phi * r * r;
        return luas;
        }
        
        public static void main(String[] args) {
               String ulang;
                int z = 0;
        do{
            int x = menuUtama();
            if (x == 1){ 
                 double luas;
                 int alas,tinggi;
                 System.out.print("Masukkan alas: ");
                 alas = sc.nextInt();
                 System.out.print("Masukkan tinggi: ");
                 tinggi = sc.nextInt();
                 luas = (alas*tinggi) / 2;
                 System.out.println("Luas Segitiga adalah " + luas);
            }
            if (x == 2){
                int luas,panjang,lebar;
                System.out.print("Masukkan panjang: ");
                 panjang = sc.nextInt();
                 System.out.print("Masukkan lebar: ");
                 lebar = sc.nextInt();
                 luas = panjang*lebar;
                 System.out.println("Luas Persegi Panjang adalah " + luas);
            }
            if (x == 3){
                double luas;
                double phi;
                int r;
                System.out.print("Masukkan phi: ");
                phi = sc.nextDouble();
                System.out.print("Masukkan jari-jari: ");
                r = sc.nextInt();
                luas = phi * r * r;
                System.out.println("Luas Lingkaran adalah " + luas);
            }
            else{
                    System.out.print("Maaf menu yang Anda pilih tidak sesuai");
                }
        
        System.out.println();
        System.out.print("Apakah Anda Ingin Memilih Menu Lainnya (Y/T) ?  ");
        sc.nextLine();
        ulang = sc.nextLine();
        System.out.println();
                 
                } while(ulang.equalsIgnoreCase("Y"));
                z++;
}
    }