import java.util.Locale;
import java.util.Scanner;

public class GalToLit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Masukkan jumlah galon: ");
        double gallons = in.nextDouble();
        double liters = gallons * 3.785;

        System.out.println(gallons + " galon sama dengan " + liters + " liter");

        in.close();
    }
}
