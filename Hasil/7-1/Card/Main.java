import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Card[] hand = new Card[5];
        int jumlah = 0;

        hand[jumlah++] = kartuAcak();
        hand[jumlah++] = kartuAcak();
        System.out.println("Kartu acak 1: " + hand[0]);
        System.out.println("Kartu acak 2: " + hand[1]);

        int total = hand[0].points + hand[1].points;
        System.out.println("Total poin dua kartu: " + total);

        while (jumlah < 5 && total <= 21) {
            System.out.print("Ambil kartu lagi? (y/n): ");
            String jawab = in.next();
            if (!jawab.equalsIgnoreCase("y")) {
                break;
            }
            hand[jumlah] = kartuAcak();
            total += hand[jumlah].points;
            jumlah++;
            System.out.println("Kartu baru: " + hand[jumlah - 1]);
            System.out.print("Kartu di tangan: ");
            for (int i = 0; i < jumlah; i++) {
                System.out.print(hand[i] + "; ");
            }
            System.out.println();
            System.out.println("Total poin: " + total);
        }

        in.close();
    }

    static Card kartuAcak() {
        int suitNumber = (int) (Math.random() * 4.0 + 1);
        int faceNumber = (int) (Math.random() * 13.0 + 1);
        return new Card(suitNumber, faceNumber);
    }
}
