import java.util.Locale;
import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        int[] nilai = new int[5];
        int total = 0;

        System.out.println("Masukkan 5 nilai tes (0-100).");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Nilai tes ke-" + (i + 1) + ": ");
            nilai[i] = in.nextInt();
            total += nilai[i];
        }

        double rataRata = (double) total / nilai.length;

        System.out.print("Nilai yang dimasukkan: ");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i] + " ");
        }
        System.out.println();
        System.out.printf(Locale.US, "Rata-rata mahasiswa: %.2f%n", rataRata);

        in.close();
    }
}
