package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.*;

public class WordFrequencyTest {
    private static WordFrequency wordFrequency;
    BufferedReader bufferedReader;

    @Before
    public void setUp() throws Exception {
        wordFrequency = new WordFrequency();
        bufferedReader = new BufferedReader(new FileReader("src/test/com/stackroute/practice/FileDemo.txt"));
    }

    @After
    public void tearDown() throws Exception {
        wordFrequency = null;
    }

    @Test
    public void frequencyOfWords() throws IOException {
        StringBuilder fileString = new StringBuilder();
        String st;

        while ((st = bufferedReader.readLine()) != null) {
            fileString.append(st).append("\n");
        }
        ;
        System.out.println(fileString);
        String expexted = "i - 3,\n" +
                "am - 1,\n" +
                "like - 1,\n" +
                "have - 1,\n" +
                "a - 2,\n" +
                "to - 1,\n" +
                "man - 1,\n" +
                "sleep - 1,\n" +
                "home - 1";
        assertEquals(expexted, wordFrequency.frequencyOfWords(fileString.toString()));

    }
    @Test
    public void testFrequencyOfWordsFailure() throws IOException {
        StringBuilder fileString = new StringBuilder();
        String st;

        while ((st = bufferedReader.readLine()) != null) {
            fileString.append(st).append("\n");
        }
        assertNotNull(wordFrequency.frequencyOfWords(fileString.toString()));
    }
}
