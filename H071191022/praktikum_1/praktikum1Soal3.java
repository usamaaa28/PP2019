import java.util.Scanner;

public class praktikum1Soal3 {

    public static void main(String[] args) {
        Scanner praktikum = new Scanner (System.in);

        //a = sudut elevasi pengamat terhadap ujung depan kapal
        //b = sudut elevasi pengamat terhadap ujung belakang kapal
        //h = tinggi menara

        System.out.println("masukkan nilai a");
        float a = praktikum.nextFloat();
        System.out.println("masukkan nilai b");
        float b = praktikum.nextFloat();
        System.out.println("masukkan nilai h");
        float h = praktikum.nextFloat();

        double x1 = Math.tan(Math.toRadians(a))*h;
        double x2 = Math.tan(Math.toRadians(b))*h;
        double panjangKapal = (x1-x2);

        System.out.printf("panjang kapal = %.1f ",panjangKapal);


    }
}
