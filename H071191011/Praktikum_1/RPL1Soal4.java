import java.util.Scanner;

class RPL1Soal4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int uang = sc.nextInt();

		int uang100K = uang / 100000;
		uang -= uang100K * 100000;
		int uang50K = uang / 50000;
		uang -= uang50K * 50000;
		int uang20K = uang / 20000;
		uang -= uang20K * 20000;
		int uang10K = uang / 10000;
		uang -= uang10K * 10000;
		int uang5K = uang / 5000;
		uang -= uang5K * 5000;
		int uang2K = uang / 2000;
		uang -= uang2K * 2000;
		int uang1K = uang / 1000;
		uang -= uang1K * 1000;

		System.out.println("Jumlah uang Rp.100.000 = " + uang100K);
		System.out.println("Jumlah uang Rp.50.000 = " + uang50K);
		System.out.println("Jumlah uang Rp.20.000 = " + uang20K);
		System.out.println("Jumlah uang Rp.10.000 = " + uang10K);
		System.out.println("Jumlah uang Rp.5000 = " + uang5K);
		System.out.println("Jumlah uang Rp.2000 = " + uang2K);
		System.out.println("Jumlah uang Rp.1000 = " + uang1K);
	}
}
