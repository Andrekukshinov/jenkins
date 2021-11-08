package com.kukshynau.app.service;

import com.kukshynau.app.service.Math;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathTest {

    @Test
    public void increment() {
        Math math = new Math();

        int result = math.increment(6);

        assertEquals(7, result);
    }
}