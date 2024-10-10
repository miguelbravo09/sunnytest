package migue.sunnytest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePageTest {

    @BeforeClass
    public void setUp() {
        // Code to set up resources before running tests
        System.out.println("Setting up test environment...");
    }

    @Test
    public void testMethod1() {
        // Test logic for testMethod1
        System.out.println("Running testMethod1...");
        int actual = 5;
        int expected = 5;
        Assert.assertEquals(actual, expected, "Values do not match!");
    }

    @Test
    public void testMethod2() {
        // Test logic for testMethod2
        System.out.println("Running testMethod2...");
        String str = "TestNG";
        Assert.assertNotNull(str, "String should not be null");
    }

    @AfterClass
    public void tearDown() {
        // Code to release resources after all tests are done
        System.out.println("Cleaning up test environment...");
    }
}