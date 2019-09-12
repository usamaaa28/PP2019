import java.util.Scanner;

class RPL1Tugas1 {
	// Buatlah program yang menghitung dan menunjukkan jumlah liter bahan
	// bakar yang dibutuhkan untuk perjalanan, menggunakan mobil dengan
	// efisiensi 14 km/L
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double efficiency = 14.0; // km/L
		int time = sc.nextInt(); // hour
		int speed = sc.nextInt(); // km/h

		int distance = speed * time; // km/h * h = km
		double neededFuel = distance / efficiency; // km / (km/L) = L
		System.out.printf("Bahan bakar yang dibutuhkan: %.3f L\n", neededFuel);
	}
}