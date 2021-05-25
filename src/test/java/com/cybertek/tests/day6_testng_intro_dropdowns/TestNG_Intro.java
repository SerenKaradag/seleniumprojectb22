package com.cybertek.tests.day6_testng_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setUpClass(){
        System.out.println("-> BEFORE CLASS IS RUNNING....");
    }
    @AfterClass
    public void tearDownClass(){
        System.out.println("-> AFTER CLASS IS RUNNING....");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("---------> BEFORE METHOD IS RUNNING....");
    }

    @AfterMethod
    public void teardownMethod(){
        System.out.println("---------> AFTER METHOD IS RUNNING....");
    }


    @Test(priority = 1) // We can priority the test case
    public void test1(){
        System.out.println("Running test 1...");

        String actual = "apple";
        String expected = "apple";

        Assert.assertEquals(actual, expected);


    }


    @Test (priority = 2) // We can priority the test case
    public void test2(){
        System.out.println("Running test 2...");

        String actual = "apple";
        String expected = "apple";

        Assert.assertTrue(actual.equals(expected));
        //Assert.assertFalse(false);

    }

}
