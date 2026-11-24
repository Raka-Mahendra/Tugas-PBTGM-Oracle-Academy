import java.util.Locale;
import java.util.Scanner;

public class MatrixOperations {
    static final int SIZE = 2;
    static final double[][] matriksA = new double[SIZE][SIZE];
    static final double[][] matriksB = new double[SIZE][SIZE];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        boolean jalan = true;

        while (jalan) {
            System.out.println("Menu:");
            System.out.println("a. Masukkan Matriks A");
            System.out.println("b. Masukkan Matriks B");
            System.out.println("c. Tampilkan A + B");
            System.out.println("d. Tampilkan A - B");
            System.out.println("e. Tampilkan A * B");
            System.out.println("f. Keluar");
            System.out.print("Pilihan: ");
            String pilihan = in.next().toLowerCase();

            switch (pilihan) {
                case "a":
                    isiMatriks(in, matriksA, "A");
                    break;
                case "b":
                    isiMatriks(in, matriksB, "B");
                    break;
                case "c":
                    tampilkan(tambah(), "A + B");
                    break;
                case "d":
                    tampilkan(kurang(), "A - B");
                    break;
                case "e":
                    tampilkan(kali(), "A * B");
                    break;
                case "f":
                    jalan = false;
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak dikenal.");
            }
        }

        in.close();
    }

    static void isiMatriks(Scanner in, double[][] m, String nama) {
        System.out.println("Masukkan elemen Matriks " + nama + ":");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print("Baris " + (i + 1) + " kolom " + (j + 1) + ": ");
                m[i][j] = in.nextDouble();
            }
        }
    }

    static double[][] tambah() {
        double[][] hasil = new double[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }
        return hasil;
    }

    static double[][] kurang() {
        double[][] hasil = new double[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                hasil[i][j] = matriksA[i][j] - matriksB[i][j];
            }
        }
        return hasil;
    }

    static double[][] kali() {
        double[][] hasil = new double[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                double jumlah = 0;
                for (int k = 0; k < SIZE; k++) {
                    jumlah += matriksA[i][k] * matriksB[k][j];
                }
                hasil[i][j] = jumlah;
            }
        }
        return hasil;
    }

    static void tampilkan(double[][] m, String judul) {
        System.out.println(judul + ":");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("[ ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("]");
        }
    }
}
