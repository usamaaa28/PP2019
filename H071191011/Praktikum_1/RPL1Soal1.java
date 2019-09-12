import java.util.Scanner;

class RPL1Soal1 {
	// Buatlah sebuah program untuk menghitung luas segitiga.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double alas = sc.nextDouble();
		double tinggi = sc.nextDouble();

		System.out.printf("Luas : %.1f m\n", (alas * tinggi) / 2.0);
	}
}
