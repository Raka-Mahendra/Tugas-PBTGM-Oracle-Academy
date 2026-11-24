public class Student {
    private String name;
    private int credits;
    private double gpa;
    private double qualityPoints;

    public Student(String name, int credits, double qualityPoints) {
        this.name = name;
        this.credits = credits;
        this.qualityPoints = qualityPoints;
        this.gpa = qualityPoints / credits;
    }

    public double getGPA() {
        return qualityPoints / credits;
    }

    public void addSemester(int newCredits, double newQualityPoints) {
        credits += newCredits;
        qualityPoints += newQualityPoints;
        gpa = qualityPoints / credits;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public double getQualityPoints() {
        return qualityPoints;
    }

    public void display() {
        System.out.println("Nama: " + name);
        System.out.println("Kredit: " + credits);
        System.out.println("Poin mutu: " + qualityPoints);
        System.out.println("IP: " + gpa);
    }
}
