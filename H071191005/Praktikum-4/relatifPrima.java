import java.util.Scanner;
class relatifPrima {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int indeks = sc.nextInt();
        int array[] = new int[indeks];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int i, j, n  = indeks - 1;
        for ( i = 0; i < array.length; i++) {
            j = 1;
            j += i;
            for (int a = 0; a < n; a++) {
                if (array[i] % array[j] != 0 && array[j] % array[i] != 0) {
                    System.out.println(array[i]+" "+array[j]);
                }
                j++;
            }
            n--;
        }

    }
}