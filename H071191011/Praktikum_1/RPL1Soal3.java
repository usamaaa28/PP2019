import java.util.Scanner;

class RPL1Soal3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean c = a % b == 0 || b % a == 0;

		System.out.println("Apakah " + a + " kelipatan dari " + b + "? " + c);
	}
}
