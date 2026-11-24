import java.util.Locale;
import java.util.Scanner;

public class Mountville {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Peringkat: valedictorian, salutatorian, atau tidak ada? ");
        String peringkat = in.next();
        System.out.print("Jumlah siswa di sekolah: ");
        int jumlahSiswa = in.nextInt();
        System.out.print("GPA: ");
        double gpa = in.nextDouble();
        System.out.print("Skor SAT: ");
        int sat = in.nextInt();

        boolean diterima = false;

        boolean peringkatTinggi = peringkat.equalsIgnoreCase("valedictorian")
                || peringkat.equalsIgnoreCase("salutatorian");

        if (peringkatTinggi && jumlahSiswa >= 1400) {
            diterima = true;
        } else if (gpa >= 4.0 && sat >= 1100) {
            diterima = true;
        } else if (gpa >= 3.5 && sat >= 1300) {
            diterima = true;
        } else if (gpa >= 3.0 && sat >= 1500) {
            diterima = true;
        }

        if (diterima) {
            System.out.println("Selamat, Anda diterima di Mountville University.");
        } else {
            System.out.println("Maaf, Anda belum memenuhi kriteria penerimaan.");
        }

        in.close();
    }
}
