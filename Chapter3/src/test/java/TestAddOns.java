import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import za.ac.cput.project.AddOns;
import za.ac.cput.project.CreateMenu;

/**
 * Created by student on 2015/02/19.
 */
public class TestAddOns {
    @BeforeClass
    public static void beforeClass()
    {

    }
    @Test
    public void testAddOns()
    {
        System.out.println("Check if value returned is not Null");
        //String strAdd = "Life";
        AddOns test = new AddOns();
        Assert.assertNotNull(test.addOnsMenu());
    }
    @AfterClass
    public static void afterClass()
    {

    }

}
