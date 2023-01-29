package instruments;

import behaviours.ISell;
import instrumentQualities.ColorType;
import instrumentQualities.InstrumentType;
import instrumentQualities.MaterialType;

public abstract class Instrument implements ISell {

    private String name;
    private InstrumentType instrumentType;
    private MaterialType materialType;
    private ColorType colorType;
    private double buyingPrice;
    private double sellingPrice;

    public Instrument(String name, InstrumentType instrumentType, MaterialType materialType, ColorType colorType, double buyingPrice, double sellingPrice) {
        this.name = name;
        this.instrumentType = instrumentType;
        this.materialType = materialType;
        this.colorType = colorType;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getName() {
        return name;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public MaterialType getMaterialType() {
        return materialType;
    }

    public ColorType getColorType() {
        return colorType;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double calculateMarkUp(){
        return getSellingPrice() - getBuyingPrice();
    }
}
