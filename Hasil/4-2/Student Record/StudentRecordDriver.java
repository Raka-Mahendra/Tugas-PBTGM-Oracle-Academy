public class StudentRecordDriver {
    public static void main(String[] args) {
        StudentRecord first = new StudentRecord("Lisa", "Palombo", "123456789", "Aktif");
        StudentRecord second = new StudentRecord("Andi", "Saputra", "987654321", "Aktif");

        System.out.println("--- Mahasiswa 1 ---");
        first.displayRecord();

        System.out.println("--- Mahasiswa 2 ---");
        second.displayRecord();

        second.changeStatus("Lulus");
        System.out.println("--- Mahasiswa 2 setelah perubahan status ---");
        second.displayRecord();
    }
}
