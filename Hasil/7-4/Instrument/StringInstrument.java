public class StringInstrument extends Instrument {
    private int numStrings;

    public StringInstrument(String name, double price, boolean onSale, int numStrings) {
        super(name, price, onSale);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }
}
