package instruments;

import behaviours.IPlay;
import instrumentQualities.ColorType;
import instrumentQualities.InstrumentType;
import instrumentQualities.MaterialType;

public class Drum extends Instrument implements IPlay {

    private int numberOfDrumBits;

    public Drum(String name, InstrumentType instrumentType, MaterialType materialType, ColorType colorType, double buyingPrice, double sellingPrice, int numberOfDrumBits) {
        super(name, instrumentType, materialType, colorType, buyingPrice, sellingPrice);
        this.numberOfDrumBits = numberOfDrumBits;
    }

    public int getNumberOfDrumBits() {
        return this.numberOfDrumBits;
    }

    public String playADitty() {
        return "bang bang bang";
    }
}
