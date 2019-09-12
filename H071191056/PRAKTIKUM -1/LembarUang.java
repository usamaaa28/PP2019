import java.util.Scanner;
public class LembarUang{

    //SOAL LATIHAN 4 
    public static void main(String[] args){

        Scanner raf = new Scanner(System.in);

        System.out.println("Input money: ");
        int uang = raf.nextInt();
        
        int jumlahuang = uang / 100000;
        System.out.println("Jumlah uang Rp 100.000 adalah " + jumlahuang);
        
        int sisa = uang - (100000 * jumlahuang);
        int jumlahUang1 = sisa /  50000;
        System.out.println("Jumlah uang Rp 50.0000 adalah " + jumlahUang1);
        
        int sisa2 = sisa - (50000 * jumlahUang1);
        int jumlahUang2 = sisa2 / 20000;
        System.out.println("Jumlah uang Rp 20.0000 adalah " + jumlahUang2);

        int sisa3 = sisa2 - (20000 * jumlahUang2);
        int jumlahUang3 = sisa3 / 10000;
        System.out.println("Jumlah uang Rp 10.0000 adalah " + jumlahUang3);

        int sisa4 = sisa3 - (10000 * jumlahUang3);
        int jumlahUang4 = sisa4 / 5000;
        System.out.println("Jumlah uang Rp 5.0000 adalah " + jumlahUang4);

        int sisa5 = sisa4 - (5000 * jumlahUang4);
        int jumlahUang5 = sisa5 / 2000;
        System.out.println("Jumlah uang Rp 2.000 adalah " + jumlahUang5);

        int sisa6 = sisa5 - (2000 * jumlahUang5);
        int jumlahUang6 = sisa6 / 1000;
        System.out.println("Jumlah uang Rp 1.000 adalah " + jumlahUang6);


    }
}