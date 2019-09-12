import java.util.Scanner;

public class BeratBadan{
    public static void main(String[] args){

        Scanner raf = new Scanner(System.in);

        System.out.println("Silahkan Input Data Diri Anda: ");

        String nama = raf.nextLine();
        System.out.println("Masukkan Tinggi: ");
        float tinggi = raf.nextFloat();
        System.out.println("Masukkan Badan: ");
        float berat = raf.nextFloat();
        float persentase = raf.nextFloat();

        float beratIdeal = (tinggi - 100) - ((tinggi - 100) * persentase / 100);
        float target = beratIdeal - berat;
               
        System.out.println("Nama: " + nama);
        System.out.println("Tinggi Badan: " + tinggi);
        System.out.println("Berat Badan: " + berat + " kg");
        System.out.printf("Berat Badan Ideal: " + beratIdeal + " kg\n");
        System.out.printf("Target: " + "%.1f kg",target);

    }
}