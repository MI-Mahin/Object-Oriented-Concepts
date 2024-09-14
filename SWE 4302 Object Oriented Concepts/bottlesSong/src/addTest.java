import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class addTest {
    @Test
    void TwoPlusTwo(){
        add add = new add();
        assertEquals(4,add.add(2,2));
    }

}