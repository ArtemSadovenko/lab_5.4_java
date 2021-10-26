package com.company;

import org.junit.Assert;

import org.junit.Test;

import static org.junit.Assert.*;


public class test_54 extends Main {

    @Test
    public void testFunc0() throws Exception {
        double actual = func0(5, 15);
        double expected = 1.0289975070787445;

        Assert.assertEquals(actual, expected, 0.00000001);
    }
}