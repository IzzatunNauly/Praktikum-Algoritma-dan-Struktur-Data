import java.util.Scanner;
class nomor2 {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	int saldo;
        int bunga;
        int bulan;
        
        System.out.println("===========SELAMAT DATANG=============");
	System.out.println("======================================");
	System.out.println("Masukkan saldo anda: ");
	saldo = in.nextInt();
	System.out.println("Masukkan bunga: ");
	bunga = in.nextInt();
        bulan = saldo * bunga;
	System.out.println("Luas Segitiga: " + bulan);
	}
}