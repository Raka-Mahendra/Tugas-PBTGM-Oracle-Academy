import java.util.Locale;
import java.util.Scanner;

public class PlanetWeight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Masukkan berat Anda di Bumi (lbs): ");
        double earthWeight = in.nextDouble();

        System.out.println("Pilih planet:");
        System.out.println("1. Merkurius");
        System.out.println("2. Venus");
        System.out.println("3. Mars");
        System.out.println("4. Jupiter");
        System.out.println("5. Saturnus");
        System.out.println("6. Uranus");
        System.out.println("7. Neptunus");
        System.out.print("Nomor pilihan: ");
        int pilihan = in.nextInt();

        String planet;
        double faktor;

        switch (pilihan) {
            case 1:
                planet = "Merkurius";
                faktor = 0.38;
                break;
            case 2:
                planet = "Venus";
                faktor = 0.91;
                break;
            case 3:
                planet = "Mars";
                faktor = 0.38;
                break;
            case 4:
                planet = "Jupiter";
                faktor = 2.36;
                break;
            case 5:
                planet = "Saturnus";
                faktor = 0.92;
                break;
            case 6:
                planet = "Uranus";
                faktor = 0.89;
                break;
            case 7:
                planet = "Neptunus";
                faktor = 1.13;
                break;
            default:
                planet = null;
                faktor = 0;
        }

        if (planet == null) {
            System.out.println("Pilihan planet tidak valid.");
        } else {
            double berat = earthWeight * faktor;
            System.out.printf(Locale.US, "Berat Anda di %s adalah %.1f lbs.%n", planet, berat);
        }

        in.close();
    }
}
