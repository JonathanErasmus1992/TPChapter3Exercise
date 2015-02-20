package za.ac.cput.project;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by student on 2015/02/20.
 */
public class TestCarClasses {
    @BeforeClass
    public static void beforeClass()
    {

    }
    @Test
    public void testCarClasses()
    {
        System.out.println("Check if value returned is not null");
        String strTest = "";
        CarClasses test = new CarClasses();
        Assert.assertNotNull(test.carClasses());
    }
    @AfterClass
    public static void afterClass()
    {

    }
}
