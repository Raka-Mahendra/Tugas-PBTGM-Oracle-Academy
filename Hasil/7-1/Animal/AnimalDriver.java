public class AnimalDriver {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal(1200, 6, 9);

        System.out.println("Animal #1 memiliki kecepatan " + animal1.getSpeed() + " mil per jam.");
        System.out.println("Animal #2 memiliki kecepatan " + animal2.getSpeed() + " mil per jam.");
    }
}
