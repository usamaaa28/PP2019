import java.util.Scanner;
class Praktikum4{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int efisiensi = 14;
        System.out.print("waktu = ");
        int waktu = sc.nextInt();
        System.out.print("kecepatan rata rata = ");
        int KecepatanRataRata = sc.nextInt();
        float jarak = waktu*KecepatanRataRata;
        float PenggunaanBensin = jarak/efisiensi;
        System.out.printf("bensin yang terpakai = %.3fl", PenggunaanBensin);
    }
}