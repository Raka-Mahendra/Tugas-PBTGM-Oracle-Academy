import java.util.Date;

public class Student extends Person {
    private String studentId;
    private double gpa;
    private String major;
    private String degree;
    private int expectedGraduationYear;

    public Student(String firstName, String middleName, String lastName, Date dateOfBirth,
                   String studentId, String major, String degree, int expectedGraduationYear) {
        super(firstName, middleName, lastName, dateOfBirth);
        this.studentId = studentId;
        this.major = major;
        this.degree = degree;
        this.expectedGraduationYear = expectedGraduationYear;
    }

    public String getStudentId() { return studentId; }
    public double getGpa() { return gpa; }
    public String getMajor() { return major; }
    public String getDegree() { return degree; }
    public int getExpectedGraduationYear() { return expectedGraduationYear; }

    public void changeMajor(String newMajor) {
        major = newMajor;
    }

    public void computeGPA(String[] grades) {
        double total = 0;
        for (int i = 0; i < grades.length; i++) {
            total += pointValue(grades[i]);
        }
        gpa = total / grades.length;
    }

    private double pointValue(String grade) {
        switch (grade) {
            case "A": return 4.0;
            case "A-": return 3.67;
            case "B+": return 3.33;
            case "B": return 3.0;
            case "B-": return 2.67;
            case "C+": return 2.33;
            case "C": return 2.0;
            case "D": return 1.0;
            case "F": return 0.0;
            default: return 0.0;
        }
    }

    public void display() {
        System.out.println("Nama: " + getName());
        System.out.println("NIM: " + studentId);
        System.out.println("Jurusan: " + major);
        System.out.println("Gelar: " + degree);
        System.out.println("Tahun lulus yang diharapkan: " + expectedGraduationYear);
        System.out.println("IP: " + gpa);
    }
}
