package za.ac.cput.project;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by student on 2015/02/20.
 */
public class TestProgramMain {
    @BeforeClass
    public static void beforeClass()
    {

    }
    @Test
    public void testChoice()
    {
        System.out.println("Check to see if user enters an option");
        String strTest = "";
        ProgramMain test = new ProgramMain();
        Assert.assertFalse("Check if not true", test.isEmpty("Dummy Value"));
    }
    @AfterClass
    public static void afterClass()
    {

    }
}
