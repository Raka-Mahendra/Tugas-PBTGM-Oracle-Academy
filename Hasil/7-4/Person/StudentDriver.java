import java.util.Date;

public class StudentDriver {
    public static void main(String[] args) {
        Student mahasiswa = new Student("Andi", "Putra", "Saputra", new Date(),
                "2026001", "Ilmu Komputer", "Sarjana", 2030);

        mahasiswa.computeGPA(new String[]{"A", "B+", "A-", "B", "C+"});
        mahasiswa.display();

        mahasiswa.changeMajor("Sastra");
        System.out.println("Jurusan setelah diubah: " + mahasiswa.getMajor());
    }
}
