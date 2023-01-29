package instruments;

import behaviours.IPlay;
import instrumentQualities.ColorType;
import instrumentQualities.InstrumentType;
import instrumentQualities.MaterialType;

public class Piano extends Instrument implements IPlay {

    private int numberOfKeys;

    public Piano(String name, InstrumentType instrumentType, MaterialType materialType, ColorType colorType, double buyingPrice, double sellingPrice) {
        super(name, instrumentType, materialType, colorType, buyingPrice, sellingPrice);
        this.numberOfKeys = 22;
    }

    public int getNumberOfKeys() {
        return this.numberOfKeys;
    }

    public String playADitty() {
        return "pia pia piano...";
    }
}
