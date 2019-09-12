import java.util.Scanner;

public class PenggunaanBensin{
    public static void main(String[] args){

        //TUGAS PRAKTIKUM NOMOR 1

        Scanner raf = new Scanner(System.in);

        System.out.println("Waktu tempuh perjalanan: ");
        int waktu = raf.nextInt();

        System.out.println("Kecepatan rata-rata: ");
        int kecepatan = raf.nextInt();

        float efisien;
        efisien = 14f;

        float bensin = (kecepatan / efisien) * waktu;

        /*int wk;
        wk = waktu * kecepatan;
        float bensin;
        bensin = wk / efisien;
        */
        System.out.printf("Bensin yang digunakan:  " + "%.3f L",bensin);
    }
}