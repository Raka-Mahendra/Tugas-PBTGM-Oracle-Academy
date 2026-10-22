import java.util.Scanner;

public class BusVan {
    public static void main(String[] args) {
        final int BUS_CAPACITY = 45;

        Scanner in = new Scanner(System.in);
        System.out.print("Jumlah peserta: ");
        int participants = in.nextInt();

        if (participants < 0) {
            System.out.println("Jumlah peserta tidak boleh negatif.");
        } else {
            int buses = participants / BUS_CAPACITY;
            int vanPassengers = participants % BUS_CAPACITY;

            System.out.println("Bus penuh: " + buses);
            System.out.println("Penumpang van: " + vanPassengers);
        }

        in.close();
    }
}
