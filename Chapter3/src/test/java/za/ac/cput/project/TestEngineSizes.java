package za.ac.cput.project;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by student on 2015/02/20.
 */
public class TestEngineSizes {
    @BeforeClass
    public static void beforeClass()
    {

    }
    @Test
    public void testCarEngineS()
    {
        System.out.println("Check if value returned is not null");
        //String strTest = "";
        EngineSizes test = new EngineSizes();
        Assert.assertNotNull(test.carEngineSizes());
    }
    @AfterClass
    public static void afterClass()
    {

    }
}
