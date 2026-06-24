package com.mrk.app.n1833;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CountIceCreamTest {

    @Test
    public void test1() {
        assertEquals(4, CountIceCream.maxIceCream(new int[] { 1, 3, 2, 4, 1 }, 7));
    }

    @Test
    public void test2() {
        assertEquals(0, CountIceCream.maxIceCream(new int[] { 10, 6, 8, 7, 7, 8 }, 5));
    }

    @Test
    public void test3() {
        assertEquals(6, CountIceCream.maxIceCream(new int[] { 1, 6, 3, 1, 2, 5 }, 20));
    }
}
