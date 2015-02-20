import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import za.ac.cput.project.CreateMenu;

/**
 * Created by student on 2015/02/19.
 */
public class TestCreateM {
    @BeforeClass
    public static void beforeClass()
    {

    }
    @Test
    public void testCreateM()
    {
        System.out.println("Has a valid option been selected");
        CreateMenu test = new CreateMenu();
        Assert.assertTrue("Check if valid option was selected", test.isVString("Choose Car Manufacturer") );
    }
    @AfterClass
    public static void afterClass()
    {

    }
}
