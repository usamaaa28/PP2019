import java.util.Scanner;

class RPL1Tugas3 {
	// Sebuah kapal sedang berlabuh dalam posisi menghadap ke menara. Seorang
	// pengamat ingin menghitung panjang kapal tersebut dengan mengetahui
	// ketinggian menara, sudut elevasi pengamat terhadap ujung dengan kapal
	// dan sudut elevasi pengamat terhadap ujung belakang kapal. Buatlah
	// program untuk menghitung panjang kapal tersebut.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double height = sc.nextDouble(); // tinggi
		double frontElevationAngle = sc.nextDouble(); // sudut elevasi belakang (DERAJAT)
		double backElevationAngle = sc.nextDouble(); // sudut elevasi depan (DERAJAT)

		double frontDistanceFromTower = Math.tan(Math.toRadians(backElevationAngle));
		double backDistanceFromTower = Math.tan(Math.toRadians(frontElevationAngle));
		double shipLength = (backDistanceFromTower - frontDistanceFromTower) * height;
		System.out.printf("%.1f m", shipLength);
	}
}
