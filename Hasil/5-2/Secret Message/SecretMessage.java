import java.util.Scanner;

public class SecretMessage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder pesan = new StringBuilder();
        int terkumpul = 0;

        System.out.println("Masukkan 10 angka kode pesan, satu per satu.");

        while (terkumpul < 10) {
            System.out.print("Angka ke-" + (terkumpul + 1) + ": ");
            int angka = in.nextInt();
            char huruf = ubah(angka);

            if (huruf == '?') {
                System.out.println("Angka " + angka + " belum terpecahkan, masukkan angka baru.");
            } else {
                pesan.append(huruf);
                terkumpul++;
            }
        }

        System.out.println("Pesan yang diuraikan: " + pesan);

        in.close();
    }

    static char ubah(int angka) {
        switch (angka) {
            case 1: return 'D';
            case 2: return 'W';
            case 3: return 'E';
            case 4: return 'L';
            case 5: return 'H';
            case 6: return 'O';
            case 7: return 'R';
            default: return '?';
        }
    }
}
