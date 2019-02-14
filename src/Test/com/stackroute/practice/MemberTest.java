package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {
    private static Member member;
    @Before
    public void setUp() throws Exception {
        member = new Member("Harry", 30,2500.50);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void details() {
        String expected="Members Name: Harry Potter\n" +
                "Members Age: 30\n" +
                "Members Salary: 2500.3";
        String actual=member.details();
        assertEquals(expected,actual);
    }
    @Test
    public void detailsFailure() {
        assertNotNull(member.details());
    }

}