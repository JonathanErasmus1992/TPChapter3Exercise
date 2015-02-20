import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import za.ac.cput.project.AddOns;
import za.ac.cput.project.CarManufacturers;

/**
 * Created by student on 2015/02/19.
 */
public class TestCarManu {
    @BeforeClass
    public static void beforeClass()
    {

    }
    @Test
    public void testCarManu()
    {
        System.out.println("Check if value returned is not null");
        String strTest = "Test";
        CarManufacturers test = new CarManufacturers();
        Assert.assertNotNull(test.carManuMenu());
    }
    @AfterClass
    public static void afterClass()
    {

    }
}
