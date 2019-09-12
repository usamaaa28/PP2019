import java.util.Scanner;

public class Kapal{
        //TUGAS PRAKTIKUM NOMOR 3
    public static void main(String[] args){

    Scanner raf = new Scanner(System.in);
    
    System.out.println("Input h: ");
    int h = raf.nextInt();

    System.out.println("Input a: ");
    int a = raf.nextInt();

    System.out.println("Input b: ");
    int b = raf.nextInt();
        
  
    double alas = Math.tan(Math.toRadians(b)) * h;
    double alas2 = Math.tan(Math.toRadians(a)) * h;
    double panjang = alas2 - alas;
    
    System.out.printf("Panjang Kapal Adalah : " + "%.1f m",panjang);



    }
}