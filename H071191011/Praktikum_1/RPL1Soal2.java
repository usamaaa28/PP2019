import java.util.Scanner;

class RPL1Soal2 {
	// Buatlah sebuah program untuk menghitung berat badan ideal yang dimana
	// untuk laki-laki tinggi badan dikurang 100 lalu dikurang 10% dan untuk
	// perempuan 15%
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nama = sc.nextLine();
		double tinggiBadan = sc.nextDouble();
		double beratBadan = sc.nextDouble();
		double persentasi = sc.nextDouble();

		double tinggiBadanMin100 = tinggiBadan - 100;
		double bbIdeal = tinggiBadanMin100 - tinggiBadanMin100 * (persentasi * 0.01);

		System.out.println("Informasi");
		System.out.println("Nama : " + nama);
		System.out.printf("Tinggi Badan : %.1f cm\n", tinggiBadan);
		System.out.printf("Berat Badan : %.1f kg\n", beratBadan);
		System.out.printf("Berat Badan Ideal : %.1f kg\n", bbIdeal);
		System.out.printf("Target Berat Badan Ideal : %.1f kg\n", bbIdeal - beratBadan);
	}
}