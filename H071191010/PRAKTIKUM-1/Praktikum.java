import java.util.Scanner;

class Praktikum{
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Informasi");
    System.out.print("Nama :");
    String nama = sc.nextLine();
    System.out.print("Tinggi Badan : ");
    int tb = sc.nextInt();
    System.out.print("Berat Badan :");
    int bb = sc.nextInt();
    double presen = sc.nextDouble();
    double bbi = (tb - 100)-((presen/100)*(tb-100));
    double target = bbi - bb;
    System.out.println("berat badan ideal : " + bbi +" kg");
    System.out.printf("target berat badan ideal : %.1fkg\n" , target);
    }
}