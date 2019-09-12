import java.util.Scanner;

public class SoalLatihan{
    public static void main(String[] args){
        
        Scanner raf = new Scanner(System.in);

        System.out.println("Input bilangan a: ");
        int a = raf.nextInt();

        System.out.println("Input bilangan b: ");
        int b = raf.nextInt();

        boolean kelipatan = (a % b == 0 || b % a == 0) && ((a > 0 && b > 0);
        
        System.out.println("Apakah " + a + " Merupakan Kelipatan dari " + b + " " + kelipatan);

    }
}