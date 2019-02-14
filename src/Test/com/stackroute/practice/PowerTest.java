package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerTest {

    Power pow;
    @Before
    public void setUp() throws Exception {
        pow = new Power();
    }

    @After
    public void tearDown() throws Exception {
        pow = null;
    }

    @Test
    public void powOf() {
        boolean expected = true;
        boolean actual = pow.powOf(16);
        assertEquals(expected,actual);
    }

    @Test
    public void is_powOf_4() {
        boolean expected = false;
        boolean actual = pow.powOf(25);
        assertEquals(expected,actual);
    }
    @Test
    public void is_powOf_Four() {
        boolean expected = false;
        boolean actual = pow.powOf(89);
        assertEquals(expected,actual);
    }

    @Test
    public void testPowOfFailure(){
        assertNotNull(pow.powOf(16));
    }
}