import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class cupTest {

    @Test
    void getLiquidType() {
        cup c= new cup("Juice",85.4);
        //assertEquals(42,24);
        assertEquals("Juice",c.getLiquidType());
    }
    @Test
    void getPercentFull() {
        cup c= new cup("Juice",85.4);
        assertEquals(85.4,c.getPercentFull());
    }
    @Test
    void setLiquidType() {
        cup c= new cup("Water",85.4);
        c.setLiquidType("Water");
        assertEquals("Water",c.getLiquidType());
    }
}