import java.util.Scanner;

public class TernaryDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai x: ");
        int x = in.nextInt();

        boolean hasil = (x <= 7) ? true : false;
        System.out.println("x kurang dari atau sama dengan 7: " + hasil);

        in.close();
    }
}
