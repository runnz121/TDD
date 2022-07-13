package com.example.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TddApplicationTests {

    @Test
    @Order(1)
    void testMultiplication1() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }

    @Test
    @Order(2)
    void testMultiplication2() {
        Dollar five = new Dollar(5);
        five.times(2);
        //assertEquals(10, product.amount);
        five.times(3);
        //assertEquals(15, product.amount);
    }

    @Test
    @Order(3)
    void testMultiplication3() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }

    // hashcode 구현
    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }

}
