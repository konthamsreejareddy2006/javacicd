package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
    @Test
    public void testAdd() {
        App app = new App();
        assertEquals(30, app.add(10, 20));
    }
}