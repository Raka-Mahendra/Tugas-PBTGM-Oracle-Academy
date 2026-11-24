public class ShapeDriver {
    public static void main(String[] args) {
        Shape defaultShape = new Shape();
        Shape square = new Shape(4, true);

        System.out.println("Bentuk 1:");
        System.out.println("  Jumlah sisi: " + defaultShape.getNumSides());
        System.out.println("  Beraturan: " + defaultShape.isRegular());

        System.out.println("Bentuk 2:");
        System.out.println("  Jumlah sisi: " + square.getNumSides());
        System.out.println("  Beraturan: " + square.isRegular());

        square.setNumSides(5);
        square.setRegular(false);
        System.out.println("Bentuk 2 setelah diubah:");
        System.out.println("  Jumlah sisi: " + square.getNumSides());
        System.out.println("  Beraturan: " + square.isRegular());
    }
}
