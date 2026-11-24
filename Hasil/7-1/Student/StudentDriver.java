public class StudentDriver {
    public static void main(String[] args) {
        Student mary = new Student("Mary Jones", 14, 46);
        Student john = new Student("John Stiner", 60, 173);
        Student ari = new Student("Ari Samala", 31, 69);

        System.out.println("Data awal:");
        mary.display();
        System.out.println();
        john.display();
        System.out.println();
        ari.display();

        ari.addSemester(13, 52);
        System.out.println();
        System.out.println("Ari Samala setelah tambahan 13 kredit dan 52 poin mutu:");
        ari.display();
    }
}
