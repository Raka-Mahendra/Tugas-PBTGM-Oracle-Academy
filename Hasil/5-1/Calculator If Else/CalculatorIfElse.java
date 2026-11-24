import java.util.Locale;
import java.util.Scanner;

public class CalculatorIfElse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Masukkan bilangan pertama: ");
        double a = in.nextDouble();
        System.out.print("Masukkan bilangan kedua: ");
        double b = in.nextDouble();
        System.out.print("Masukkan operator (*, +, /, %, -): ");
        char op = in.next().charAt(0);

        if (op == '*') {
            System.out.println(a + " * " + b + " = " + (a * b));
        } else if (op == '+') {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (op == '/') {
            if (b == 0) {
                System.out.println("Pembagian dengan nol tidak diperbolehkan.");
            } else {
                System.out.println(a + " / " + b + " = " + (a / b));
            }
        } else if (op == '%') {
            System.out.println(a + " % " + b + " = " + (a % b));
        } else if (op == '-') {
            System.out.println(a + " - " + b + " = " + (a - b));
        } else {
            System.out.println("Operator tidak dikenal: " + op);
        }

        in.close();
    }
}
