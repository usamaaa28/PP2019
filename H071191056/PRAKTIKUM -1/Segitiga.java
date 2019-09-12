import java.util.Scanner;

public class Segitiga{
    public static void main(String[] args){

        Scanner raf = new Scanner(System.in);

        System.out.println("Input alas: ");
        int alas = raf.nextInt();

        System.out.println("Input tinggi: ");
        int tinggi = raf.nextInt();

        float luasSegitiga = (alas * tinggi) / 2f;

        System.out.printf("Luas : " + luasSegitiga + " m");


    }
}