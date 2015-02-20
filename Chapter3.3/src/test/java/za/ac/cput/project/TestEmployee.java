package za.ac.cput.project;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by student on 2015/02/20.
 */
public class TestEmployee {
    @BeforeClass
    public static void beforeClass()
    {

    }
    @Test
    public void testEmployee()
    {
        System.out.println("Check to see if user enters a valid amount");
        CalculateInterest calc = new Employee();
        Assert.assertEquals("Value entered is more than 0", calc.calculateInterest(), calc.calculateInterest() , 1);
    }
    @AfterClass
    public static void afterClass()
    {

    }
}
