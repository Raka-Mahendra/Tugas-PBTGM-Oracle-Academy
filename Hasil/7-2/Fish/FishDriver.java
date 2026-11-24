public class FishDriver {
    public static void main(String[] args) {
        Fish amber = new Fish("AngelFish", 5);
        Fish james = new Fish("Guppy", 3);
        Fish lain = new Fish();

        System.out.println("Ikan 1: " + amber.getTypeOfFish() + ", keramahan " + amber.getFriendliness());
        System.out.println("Ikan 2: " + james.getTypeOfFish() + ", keramahan " + james.getFriendliness());
        System.out.println("Ikan 3: " + lain.getTypeOfFish() + ", keramahan " + lain.getFriendliness());

        Fish palingRamahDua = Fish.nicestFish(amber, james);
        System.out.println("Ikan paling ramah dari dua ikan: " + palingRamahDua.getTypeOfFish());

        Fish palingRamahTiga = Fish.nicestFish(amber, james, lain);
        System.out.println("Ikan paling ramah dari tiga ikan: " + palingRamahTiga.getTypeOfFish());
    }
}
