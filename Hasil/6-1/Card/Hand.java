public class Hand {
    Card[] cards = new Card[5];
    int count;

    public void addCard(Card card) {
        if (count < cards.length && card != null) {
            cards[count] = card;
            count++;
        }
    }

    public int totalPoints() {
        int total = 0;
        int aces = 0;
        for (int i = 0; i < count; i++) {
            total += cards[i].points;
            if (cards[i].points == 11) {
                aces++;
            }
        }
        while (total > 21 && aces > 0) {
            total -= 10;
            aces--;
        }
        return total;
    }

    public void show(String pemilik) {
        System.out.println("Kartu " + pemilik + ":");
        for (int i = 0; i < count; i++) {
            System.out.println("  " + cards[i]);
        }
        System.out.println("Total poin: " + totalPoints());
    }
}
