public class ArrayDeclaration {
    public static void main(String[] args) {
        int[] score = new int[9];

        float[][] price = new float[10][3];

        long[][] matrix = new long[4][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 5;
            }
        }

        byte[] values = new byte[10];
        for (int i = 0; i < values.length; i++) {
            values[i] = 1;
        }

        System.out.println("score: array int dengan " + score.length + " elemen");
        System.out.println("price: array float " + price.length + " baris x " + price[0].length + " kolom");
        System.out.println("matrix: array long " + matrix.length + " baris x " + matrix[0].length + " kolom");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("  ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("values: ");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }
}
