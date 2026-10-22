public class StudentRecord {
    private String fName;
    private String lName;
    private String stuId;
    private String stuStatus;

    public StudentRecord(String fName, String lName, String stuId, String stuStatus) {
        this.fName = fName;
        this.lName = lName;
        this.stuId = stuId;
        this.stuStatus = stuStatus;
    }

    public String getFullName() {
        return fName + " " + lName;
    }

    public String getStuId() {
        return stuId;
    }

    public String getStuStatus() {
        return stuStatus;
    }

    public void changeStatus(String newStatus) {
        stuStatus = newStatus;
    }

    public void displayRecord() {
        System.out.println("Nama: " + getFullName());
        System.out.println("ID: " + stuId);
        System.out.println("Status: " + stuStatus);
    }
}
