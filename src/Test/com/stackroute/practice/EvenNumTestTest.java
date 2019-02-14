package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {
    //EvenNumTest evenNumTest;

    @Before
    public void setUp() throws Exception {
        //evenNumTest = new EvenNumTest();
    }

    @After
    public void tearDown() throws Exception {
        //evenNumTest = null;
    }

    @Test
    public void isEven() {
         Boolean expected = true;
         Boolean actual = EvenNumTest.isEven(2);
         assertEquals(expected,actual);
    }

    @Test
    public void isEvenorNot() {
        Boolean expected = false;
        Boolean actual = EvenNumTest.isEven(3);
        assertEquals(expected,actual);
    }
}