import java.util.Scanner;
public class praktikum1Soal5 {

    public static void main(String[] args) {
        Scanner praktikum = new Scanner (System.in);
        System.out.println("masukkan jumlah uang");
        int a = praktikum.nextInt();

        int uang100Rb = a/100000;
        a -= uang100Rb*100000;
        int uang50Rb = a/50000;
        a -= uang50Rb*50000;
        int uang20Rb = a/20000;
        a -= uang20Rb*20000;
        int uang10Rb = a/10000;
        a -= uang10Rb*10000;
        int uang5Rb = a/5000;
        a -= uang5Rb*5000;
        int uang2Rb = a/2000;
        a -= uang2Rb*2000;
        int uang1Rb = a/1000;
        a -= uang1Rb*1000;

        System.out.println("jumlah uang Rp. 100.000 = " + uang100Rb);
        System.out.println("jumlah uang Rp. 50.000 = " + uang50Rb);
        System.out.println("jumlah uang Rp. 20.000 = " + uang20Rb);
        System.out.println("jumlah uang Rp. 10.000 = " + uang10Rb);
        System.out.println("jumlah uang Rp. 5.000 = " + uang5Rb);
        System.out.println("jumlah uang Rp. 2.000 = " + uang2Rb);
        System.out.println("jumlah uang Rp. 1.000 = " + uang1Rb);


    }
}