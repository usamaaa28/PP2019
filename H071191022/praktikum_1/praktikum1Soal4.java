import java.util.Scanner;

public class praktikum1Soal4 {

    public static void main(String[] args) {
        Scanner praktikum = new Scanner(System.in);
        System.out.println("masukkan angka pertama");
        int a = praktikum.nextInt();
        System.out.println("masukkan angka kedua");
        int b = praktikum.nextInt();

        boolean c = a%b == 0 || b%a == 0;

        System.out.println("apakah " + a + " kelipatan dari " + b + " ? ");
        System.out.println(c);
    
    }
}