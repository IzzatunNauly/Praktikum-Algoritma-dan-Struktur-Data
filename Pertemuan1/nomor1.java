import java.util.Scanner;
public class nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Ani = 0;
        int Budi = 0;
        int Bina = 0;
        int Cita = 0;
        int beratPakaian;
        int total;
        double diskon = 0.05;
        int tarif = 4500;
        
        System.out.println("=================================================================");
        System.out.println("        Tarif untuk setiap 1kg pakaian adalah Rp. 4.500");
        System.out.println("Mencucikan baju lebih dari 10 kg maka akan mendapatkan diskon 5%.");
        System.out.println("=================================================================");
        
        System.out.print("Masukkan berat pakaian Ani: ");
        beratPakaian=input.nextInt();
        
        if(beratPakaian>10){
            Ani = (int) (beratPakaian * tarif * 0.05);
            System.out.println("Jadi yang harus dibayar adalah " + Ani); 
            System.out.println("Selamat anda mendapat diskon sebesar 5%");
        }else if(beratPakaian < 10){
            Ani = beratPakaian * tarif;
            System.out.println("Jadi yang harus dibayar adalah " + Ani); 
            System.out.println("Maaf anda tidak mendapat diskon");
        }
        
        System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<");
        System.out.print("Masukkan berat pakaian Budi: ");
        beratPakaian = input.nextInt();
        
        if(beratPakaian > 10){
            Budi = (int) (beratPakaian * tarif *0.05);
            System.out.println("Jadi yang harus dibayar adalah " + Budi); 
            System.out.println("Selamat anda mendapat diskon sebesar 5%");
        }else if(beratPakaian < 10){
            Budi = beratPakaian * tarif;
            System.out.println("Jadi yang harus dibayar adalah " + Budi); 
            System.out.println("Maaf anda tidak mendapat diskon");
        }
        
        System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<");
        System.out.print("Masukkan berat pakaian Bina: ");
        beratPakaian = input.nextInt();
        
        if(beratPakaian > 10){
            Bina = (int) (beratPakaian * tarif * 0.05);
            System.out.println("Jadi yang harus dibayar adalah " + Bina); 
            System.out.println("Selamat anda mendapat diskon sebesar 5%");
        }else if(beratPakaian < 10){
            Bina = beratPakaian * tarif;
            System.out.println("Jadi yang harus dibayar adalah " + Bina); 
            System.out.println("Maaf anda tidak mendapat diskon");
        }    
        
        System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<");
        System.out.print("Masukkan berat pakaian Cita: ");
        beratPakaian = input.nextInt();
        
        if(beratPakaian > 10){
            Cita = (int) (beratPakaian * tarif * 0.05);
            System.out.println("Jadi yang harus dibayar adalah " + Cita); 
            System.out.println("Selamat anda mendapat diskon sebesar 5%");
        }else if(beratPakaian < 10){
            Cita = beratPakaian * tarif;
            System.out.println("Jadi yang harus dibayar adalah " + Cita); 
            System.out.println("Maaf anda tidak mendapat diskon");
        }
        
        System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<");
        total =(Ani + Budi + Bina + Cita);
        System.out.println("Jadi Total Pendapat Smile Laundry adalah : " + total);
}
}

