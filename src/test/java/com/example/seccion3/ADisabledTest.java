package com.example.seccion3;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ADisabledTest {

    @Test
    @Disabled("Deshabilitado hasta que se corrija con issue # 1000")
    void test1() {
        System.out.println("test1");
        assertTrue(true);
    }

    @Test
    void test2() {
        System.out.println("test2");
        assertTrue(true);
    }

}
