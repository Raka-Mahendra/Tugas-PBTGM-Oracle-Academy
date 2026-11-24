public class ErrorSegments {
    public static void main(String[] args) {
        int total = 30;
        int jumlah = 4;

        System.out.println("a. Logic error");
        System.out.println("Rata-rata benar: " + (total / jumlah));
        System.out.println("Rata-rata salah: " + (total / (jumlah + 1)));

        System.out.println("b. Exception");
        try {
            int[] data = new int[3];
            data[5] = 1;
            System.out.println("Baris ini tidak dijalankan.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi exception: " + e);
        }
    }
}
