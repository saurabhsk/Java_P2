package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class Read_FileTest {
    Read_File read_file;

    @Before
    public void setUp() throws Exception {
        read_file = new Read_File();
    }

    @After
    public void tearDown() throws Exception {
        read_file = null;
    }

    @Test
    public void convertToUppercase() {
        File file=new File("src/Test/com/stackroute/practice/textfile.txt");
        String expected = "HI,\n" +
                "THIS IS THE FILE YOU NEED TO CONVERT IN UPPER CASE AND RETURN THE LENGTH.\n" +
                "77";
        String actual = read_file.convertToUppercase(file);
        assertEquals(expected,actual);
    }
}