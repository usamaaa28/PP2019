import java.util.Scanner;

public class praktikum1Soal2 {

    public static void main(String[] args) {
       Scanner praktikum = new Scanner (System.in);
       System.out.println("masukkan total detik");
       int t = praktikum.nextInt();

       int jam,menit,detik;

       jam = t/3600;
       menit = (t/60)%60;
       detik = t%60;

       System.out.println(jam + "jam : " + menit + "menit : " + detik + "detik ");



    }
}
