import java.util.Locale;
import java.util.Scanner;

public class FinalExam {
    public static void main(String[] args) {
        double average;
        int daysAbsent;
        Scanner reader = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Program ini menentukan apakah Anda bebas dari ujian akhir.");
        System.out.println("Jawab pertanyaan berikut.");
        System.out.print("Berapa rata-rata nilai Anda di kelas? ");
        average = reader.nextDouble();
        System.out.print("Berapa kali Anda absen kuliah? ");
        daysAbsent = reader.nextInt();

        if ((average >= 90 && daysAbsent <= 3) || (average >= 80 && daysAbsent == 0)) {
            System.out.println("Congratulations! You are exempt from the final exam.");
        } else {
            System.out.println("You are not exempt from the final exam.");
        }

        reader.close();
    }
}
