package shop;

import behaviours.ISell;
import instruments.Instrument;

public class Items implements ISell {

    private String itemDescription;
    private Instrument instrument;
    private double buyPrice;
    private double sellPrice;

    public Items(String itemDescription, double buyPrice, double sellPrice) {
        this.itemDescription = itemDescription;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public Items(String itemDescription, Instrument instrument) {
        this.itemDescription = itemDescription;
        this.instrument = instrument;
    }

    public String getItemDescription() {
        return this.itemDescription;
    }

    public Instrument getInstrument(){
        return this.instrument;
    }

    public double getBuyPrice() {
        return this.buyPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }


    @Override
    public double calculateMarkUp() {
        return getSellPrice() - getBuyPrice();
    }

//    public double calculateMarkUp(Instrument instrument){
//        return instrument.calculateMarkUp();
//    }
}
