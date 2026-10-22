public class Student {
    private String fName;
    private String lName;
    private String stuId;
    private String stuStatus;

    public Student(String fName, String lName, String stuId, String stuStatus) {
        this.fName = fName;
        this.lName = lName;
        this.stuId = stuId;
        this.stuStatus = stuStatus;
    }

    public void displayInfo() {
        System.out.println("Nama: " + fName + " " + lName);
        System.out.println("ID: " + stuId);
        System.out.println("Status: " + stuStatus);
    }
}
