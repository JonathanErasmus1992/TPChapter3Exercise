package za.ac.cput.project;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by student on 2015/02/20.
 */
public class TestCarColours {
    @BeforeClass
    public static void beforeClass()
    {

    }
    @Test
    public void testCarColours()
    {
        System.out.println("Check if value returned is not null");
        //String strTest = "";
        CarColours test = new CarColours();
        Assert.assertNotNull(test.carColours());
    }
    @AfterClass
    public static void afterClass()
    {

    }
}
