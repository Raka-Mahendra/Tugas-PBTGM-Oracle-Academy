import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan string pertama: ");
        String a = in.nextLine();
        System.out.print("Masukkan string kedua: ");
        String b = in.nextLine();

        if (adalahAnagram(a, b)) {
            System.out.println("\"" + a + "\" adalah anagram dari \"" + b + "\".");
        } else {
            System.out.println("\"" + a + "\" bukan anagram dari \"" + b + "\".");
        }

        in.close();
    }

    static boolean adalahAnagram(String a, String b) {
        char[] ca = bersihkan(a).toCharArray();
        char[] cb = bersihkan(b).toCharArray();
        Arrays.sort(ca);
        Arrays.sort(cb);
        return Arrays.equals(ca, cb);
    }

    static String bersihkan(String s) {
        StringBuilder hasil = new StringBuilder();
        for (char c : s.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                hasil.append(c);
            }
        }
        return hasil.toString();
    }
}
