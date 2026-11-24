public class TryCatch {
    public static void main(String[] args) {
        String[] nilai = {"10", "20", "abc", "40"};

        System.out.println("Menjumlahkan nilai yang tersimpan sebagai teks:");
        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            try {
                total += Integer.parseInt(nilai[i]);
            } catch (NumberFormatException e) {
                System.out.println("Nilai \"" + nilai[i] + "\" bukan angka, dilewati.");
            }
        }
        System.out.println("Total: " + total);
    }
}
