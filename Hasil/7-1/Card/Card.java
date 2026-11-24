public class Card {
    String suit;
    String name;
    int points;

    Card(int n1, int n2) {
        suit = getSuit(n1);
        name = getName(n2);
        points = getPoints(name);
    }

    public String getSuit(int n) {
        switch (n) {
            case 1: return "Hearts";
            case 2: return "Diamonds";
            case 3: return "Clubs";
            case 4: return "Spades";
            default: return "Unknown";
        }
    }

    public String getName(int n) {
        switch (n) {
            case 1: return "Ace";
            case 11: return "Jack";
            case 12: return "Queen";
            case 13: return "King";
            default: return String.valueOf(n);
        }
    }

    public int getPoints(String cardName) {
        if (cardName.equals("Ace")) {
            return 11;
        }
        if (cardName.equals("Jack") || cardName.equals("Queen") || cardName.equals("King")) {
            return 10;
        }
        return Integer.parseInt(cardName);
    }

    public String toString() {
        return "The " + name + " of " + suit;
    }
}
