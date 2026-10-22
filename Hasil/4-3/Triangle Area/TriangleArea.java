import java.util.Locale;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Masukkan alas: ");
        double base = in.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double height = in.nextDouble();

        if (base < 0 || height < 0) {
            System.out.println("Alas dan tinggi tidak boleh negatif.");
        } else {
            double area = 0.5 * base * height;
            System.out.printf(Locale.US, "Luas segitiga: %.2f%n", area);
        }

        in.close();
    }
}
