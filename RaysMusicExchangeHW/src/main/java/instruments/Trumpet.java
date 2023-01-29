package instruments;

import behaviours.IPlay;
import instrumentQualities.ColorType;
import instrumentQualities.InstrumentType;
import instrumentQualities.MaterialType;

public class Trumpet extends Instrument implements IPlay {

    private int numberOfValves;

    public Trumpet(String name, InstrumentType instrumentType, MaterialType materialType, ColorType colorType, double buyingPrice, double sellingPrice) {
        super(name, instrumentType, materialType, colorType, buyingPrice, sellingPrice);
        this.numberOfValves = 3;
    }

    public int getNumberOfValves() {
        return this.numberOfValves;
    }

    public String playADitty() {
        return "some great trumpet tune";
    }
}
