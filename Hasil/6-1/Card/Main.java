import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deck deck = new Deck();
        deck.shuffle();

        Hand player = new Hand();
        player.addCard(deck.draw());
        player.addCard(deck.draw());
        System.out.println("Dua kartu pertama Anda:");
        player.show("Anda");

        while (player.count < 5 && player.totalPoints() < 21) {
            System.out.print("Tambah kartu lagi? (y/n): ");
            String jawab = in.next();
            if (!jawab.equalsIgnoreCase("y")) {
                break;
            }
            player.addCard(deck.draw());
            player.show("Anda");
        }

        System.out.println("Giliran Dealer.");
        Hand dealer = new Hand();
        dealer.addCard(deck.draw());
        dealer.addCard(deck.draw());
        while (dealer.totalPoints() < 16 && dealer.count < 5) {
            dealer.addCard(deck.draw());
        }
        dealer.show("Dealer");

        int playerPoints = player.totalPoints();
        int dealerPoints = dealer.totalPoints();
        System.out.println("Poin Anda: " + playerPoints);
        System.out.println("Poin Dealer: " + dealerPoints);

        if (playerPoints > 21 || (dealerPoints <= 21 && dealerPoints > playerPoints)) {
            System.out.println("Dealer menang.");
        } else if (dealerPoints > 21 || playerPoints > dealerPoints) {
            System.out.println("Anda menang.");
        } else {
            System.out.println("Seri.");
        }

        in.close();
    }
}
