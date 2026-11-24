import java.util.Locale;
import java.util.Scanner;

public class PaintBucket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Tinggi ruangan (kaki): ");
        double tinggi = in.nextDouble();
        System.out.print("Panjang ruangan (kaki): ");
        double panjang = in.nextDouble();
        System.out.print("Lebar ruangan (kaki): ");
        double lebar = in.nextDouble();

        double luasDinding = 2 * (panjang + lebar) * tinggi;
        double luasLangit = panjang * lebar;
        double luasTotal = luasDinding + luasLangit;

        int ember5L = (int) (luasTotal / 1500);
        double sisa = luasTotal - ember5L * 1500;
        int ember1L = (int) Math.ceil(sisa / 300);

        double biaya = ember5L * 15 + ember1L * 4;

        System.out.printf(Locale.US, "Luas dinding: %.2f kaki persegi%n", luasDinding);
        System.out.printf(Locale.US, "Luas langit-langit: %.2f kaki persegi%n", luasLangit);
        System.out.printf(Locale.US, "Luas total yang dicat: %.2f kaki persegi%n", luasTotal);
        System.out.println("Ember 5 liter: " + ember5L);
        System.out.println("Ember 1 liter: " + ember1L);
        System.out.printf(Locale.US, "Total biaya: $%.2f%n", biaya);

        in.close();
    }
}
