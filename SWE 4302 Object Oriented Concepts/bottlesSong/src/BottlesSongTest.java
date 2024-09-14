import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BottlesSongTest {
    @Test
    void test1(){

        String expected="No more bottles of milk on the wall, no more bottles of milk.\n" +
                "Go to the store and buy some more, 99 bottles of milk on the wall.";
        assertEquals(expected,BottlesSong.BeerBottle(0));
    }


}