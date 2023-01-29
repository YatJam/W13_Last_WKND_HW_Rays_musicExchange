import instrumentQualities.ColorType;
import instrumentQualities.InstrumentType;
import instrumentQualities.MaterialType;
import instruments.Banjo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BanjoTest {

    Banjo banjo;

    @Before
    public void before(){
        banjo = new Banjo("da banjo", InstrumentType.STRING, MaterialType.WOOD, ColorType.ELECTRICBLUE, 12.50, 75.00);
    }

    @Test
    public void canGetIPlayString(){
        assertEquals("dueling banjos theme", banjo.playADitty());
    }

    @Test
    public void canGetNumberOfStrings(){
        assertEquals(4, banjo.getNumberOfStrings());
    }

    @Test
    public void canGetMarkUpPrice(){
        assertEquals(62.50, banjo.calculateMarkUp(), 0.001);
    }

    @Test
    public void canReturnEnumString(){
        assertEquals("electric blue", banjo.getColorType().getType());
    }
}
