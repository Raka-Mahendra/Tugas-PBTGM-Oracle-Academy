import java.util.Locale;
import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Masukkan bilangan pertama: ");
        double a = in.nextDouble();
        System.out.print("Masukkan bilangan kedua: ");
        double b = in.nextDouble();
        System.out.print("Masukkan operator (*, +, /, %, -): ");
        char op = in.next().charAt(0);

        switch (op) {
            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Pembagian dengan nol tidak diperbolehkan.");
                } else {
                    System.out.println(a + " / " + b + " = " + (a / b));
                }
                break;
            case '%':
                System.out.println(a + " % " + b + " = " + (a % b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            default:
                System.out.println("Operator tidak dikenal: " + op);
        }

        in.close();
    }
}
