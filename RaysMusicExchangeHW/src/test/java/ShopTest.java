import instrumentQualities.ColorType;
import instrumentQualities.InstrumentType;
import instrumentQualities.MaterialType;
import instruments.Piano;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;
import shop.Items;
import shop.Shop;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Trumpet trumpet;
    Piano piano;
    Items sheetMusic;
    Items guitarStrings;
    Items trumpetItem;
    Items pianoItem;

    @Before
    public void before() {
        trumpet = new Trumpet("Trumpy", InstrumentType.BRASS, MaterialType.BRASS, ColorType.LIGHTBROWN,27,450);
        piano = new Piano("Pia Pia",InstrumentType.KEYBOARD,MaterialType.WOOD,ColorType.RUBYRED,120,899.99);
        trumpetItem = new Items("trumpet", trumpet);
        pianoItem = new Items("piano",piano);
        sheetMusic = new Items("sheet music",4,9.99);
        guitarStrings = new Items("guitar strings", 7, 14.99);
        ArrayList<Items> stockList = new ArrayList<Items>();
        stockList.add(trumpetItem);
        stockList.add(pianoItem);
        stockList.add(sheetMusic);
        shop = new Shop(stockList);
    }

    @Test
    public void canAddNewStockToShop(){
        shop.addNewStock(guitarStrings);
        assertEquals(4, shop.stockCount());
    }

    @Test
    public void canRemoveStockFromInventory(){
        shop.removeStockFromInventory(sheetMusic);
        assertEquals(2, shop.stockCount());
    }

    @Test
    public void canCalculateTotalPotentialProfit(){
        shop.addNewStock(guitarStrings);
        assertEquals(1214, shop.calculateTotalPotentialProfit(), 0.001);
    }

}
