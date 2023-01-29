import instrumentQualities.ColorType;
import instrumentQualities.InstrumentType;
import instrumentQualities.MaterialType;
import instruments.Instrument;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;
import shop.Items;

import static org.junit.Assert.assertEquals;

public class ItemsTest {

    Items item;
    Items itemPiano;
    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Jam Piano", InstrumentType.KEYBOARD, MaterialType.WOOD, ColorType.MIDBROWN,120,800);
        item = new Items("Sheet Music", 2.70, 15.99);
        itemPiano = new Items("Jam Piano", piano);
    }

    @Test
    public void canGetMarkupPrice(){
        assertEquals(13.29, item.calculateMarkUp(), 0.001);
    }

    @Test
    public void canGetInstrumentName(){
        assertEquals("Jam Piano", itemPiano.getInstrument().getName());
    }
}
