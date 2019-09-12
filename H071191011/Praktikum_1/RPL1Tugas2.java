import java.util.Scanner;

class RPL1Tugas2 {
	// Buatlan program yang merubah detik ke dalam format jam:menit:detik
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int jam = a / 3600;
		int menit = a / 60 % 60; // pembagian dan modulo sama tingkat
		int detik = a % 60;
		// %02d = 00 padding
		System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
	}
}
