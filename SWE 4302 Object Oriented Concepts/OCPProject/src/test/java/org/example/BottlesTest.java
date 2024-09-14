package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BottlesTest {
    Bottles bottles = new Bottles();
    @Test
    public void test_hudai(){
        Assertions.assertEquals("hi", bottles.hudai());
    }
}