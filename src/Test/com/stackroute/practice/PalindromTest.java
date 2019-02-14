package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromTest {
    Palindrom palindrom;

    @Before
    public void setUp() throws Exception {
        palindrom = new Palindrom();
    }

    @After
    public void tearDown() throws Exception {
        palindrom=null;
    }


    @Test
    public void check_Pali() {
        Boolean expected = true;
        Boolean actual = palindrom.check_Pali("malayalam");
        assertEquals(expected,actual);
    }

    @Test
    public void Ischeck_Pali() {
        Boolean expected = false;
        Boolean actual = palindrom.check_Pali("Java");
        assertEquals(expected,actual);
    }
}