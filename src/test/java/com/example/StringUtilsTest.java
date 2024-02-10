package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsTest {
    @Test
    public void testReverseString() {
        assertEquals("dlrow olleh", StringUtils.reverseString("hello world"));
        assertEquals("987654321", StringUtils.reverseString("123456789"));
    }

    @Test
    public void testCapitalizeFirstLetter() {
        assertEquals("Hello world", StringUtils.capitalizeFirstLetter("hello world"));
        assertEquals("123abc", StringUtils.capitalizeFirstLetter("123abc"));
    }
}
