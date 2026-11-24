public class Instrument {
    private String name;
    private double price;
    private boolean onSale;

    public Instrument(String name, double price, boolean onSale) {
        this.name = name;
        this.price = price;
        this.onSale = onSale;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        if (onSale) {
            return price * 0.85;
        }
        return price;
    }

    public double getEmployeePrice() {
        return price * 0.75;
    }

    public boolean isOnSale() {
        return onSale;
    }
}
