package instruments;

import behaviours.IPlay;
import instrumentQualities.ColorType;
import instrumentQualities.InstrumentType;
import instrumentQualities.MaterialType;

public class Banjo extends Instrument implements IPlay {

    private int numberOfStrings;

    public Banjo(String name, InstrumentType instrumentType, MaterialType materialType, ColorType colorType, double buyingPrice, double sellingPrice) {
        super(name, instrumentType, materialType, colorType, buyingPrice, sellingPrice);
        this.numberOfStrings = 4;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String playADitty() {
        return "dueling banjos theme";
    }
}
