import java.util.Locale;

public class MusicStoreDriver {
    public static void main(String[] args) {
        Guitar gitarAkustik = new Guitar("Yamaha F310", 200.0, false, 6, "Akustik");
        Guitar gitarListrik = new Guitar("Fender Stratocaster", 800.0, true, 6, "Listrik");

        tampilkan(gitarAkustik);
        tampilkan(gitarListrik);
    }

    static void tampilkan(Guitar g) {
        System.out.printf(Locale.US, "%s (%s, %d senar)%n", g.getName(), g.getType(), g.getNumStrings());
        System.out.printf(Locale.US, "  Harga normal: $%.2f%n", g.getPrice());
        System.out.printf(Locale.US, "  Harga karyawan (diskon 25%%): $%.2f%n", g.getEmployeePrice());
    }
}
