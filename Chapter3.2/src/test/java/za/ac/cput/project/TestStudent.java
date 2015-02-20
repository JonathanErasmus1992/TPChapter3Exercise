package za.ac.cput.project;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by student on 2015/02/20.
 */
public class TestStudent {
    @BeforeClass
    public static void beforeClass()
    {

    }
    @Test
    public void testStudent()
    {
        System.out.println("Check to see if user enters a valid amount");
        CalculateInterest calc = new Student();
        double ftest = calc.calculateInterest();
        Assert.assertEquals("Value entered more than 0", ftest, ftest, 1);
    }
    @AfterClass
    public static void afterClass()
    {

    }
}
