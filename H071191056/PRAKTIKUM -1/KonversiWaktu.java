import java.util.Scanner;

public class KonversiWaktu{
    public static void main(String[] args){

        //TUGAS PRAKTIKUM NOMOR 2
        Scanner raf = new Scanner(System.in);

        System.out.println("Input Detik untuk dikonversi: ");
        int detik = raf.nextInt();

        System.out.println(" ");

        //KONVERSI DETIK KE JAM
        int jam = detik / 3600;
        int jam1 = detik % 3600;

        //KONVERSI DETIK KE MENIT
        int menit = detik / 60;
        int menit1 = menit % 60;
       
        //KONVERSI KE DETIK
        int detik2 = detik % 60;

        System.out.printf("%02d:%02d:%02d",jam,menit1,detik2);
      
    }
}