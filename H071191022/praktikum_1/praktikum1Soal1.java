import java.util.Scanner;

public class praktikum1Soal1 {

    public static void main(String[] args) {
        Scanner praktikum = new Scanner (System.in);

        //a = waktu yang ditempuh
        //b = kecepatan rata-rata yang ditempuh
        //c = efisiensi penggunaan bensin
        //d = bensin yang digunakan

        System.out.println("waktu");
        int a = praktikum.nextInt();
        System.out.println("kecepatan");
        int b = praktikum.nextInt();
        float c = 14;
        float d = (a*b)/c;

        System.out.printf("bensin yang digunakan %.3f L ",d);

    }

}