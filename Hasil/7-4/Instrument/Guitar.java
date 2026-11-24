public class Guitar extends StringInstrument {
    private String type;

    public Guitar(String name, double price, boolean onSale, int numStrings, String type) {
        super(name, price, onSale, numStrings);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
