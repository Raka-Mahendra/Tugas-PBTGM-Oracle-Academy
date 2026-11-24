public class PredictOutput {
    public static void main(String[] args) {
        System.out.println("Nomor 3:");
        int num[] = {7, 7, 6, 6, 5, 5, 4, 4};
        for (int i = 0; i < 8; i = i + 2) {
            System.out.print(num[i]);
        }
        System.out.println();

        System.out.println("Nomor 4:");
        int[][] num2 = {{3, 3, 3}, {2, 2, 2}};
        int[] array = {4, 3, 2};
        for (int i = 0; i < 3; i++) {
            num2[1][i] = num2[0][i] + array[i];
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(num2[i][j]);
            }
            System.out.println();
        }
    }
}
