package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {
    Students stud;

    @Before
    public void setUp() throws Exception {
        stud = new Students();
    }

    @After
    public void tearDown() throws Exception {
        stud = null;
    }

    @Test
    public void marksOf_Students() {
        String expected = "The average is: 81.50\n"+
        "The minimum is: 65\n"+
        "The maximum is: 98 \n";
        int marks[]={86,85,98,77};
        String actual = stud.marksOf_Students(4,marks);
        assertEquals(expected,actual);
    }
}