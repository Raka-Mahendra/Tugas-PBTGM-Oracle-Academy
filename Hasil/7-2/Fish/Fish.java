public class Fish {
    private String typeOfFish;
    private int friendliness;

    public Fish() {
        typeOfFish = "Unknown";
        friendliness = 3;
    }

    public Fish(String t, int f) {
        typeOfFish = t;
        friendliness = f;
    }

    public int getFriendliness() {
        return friendliness;
    }

    public String getTypeOfFish() {
        return typeOfFish;
    }

    public static Fish nicestFish(Fish a, Fish b) {
        if (a.getFriendliness() >= b.getFriendliness()) {
            return a;
        }
        return b;
    }

    public static Fish nicestFish(Fish... fishes) {
        Fish temp = fishes[0];
        for (int i = 0; i < fishes.length; i++) {
            if (fishes[i].getFriendliness() > temp.getFriendliness()) {
                temp = fishes[i];
            }
        }
        return temp;
    }
}
