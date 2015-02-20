import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import za.ac.cput.project.ProgramMain;

/**
 * Created by student on 2015/02/19.
 */
public class TestMain {

    @BeforeClass
    public static void beforeClass()
    {

    }
    @Test
    public void testStartP()
    {
        System.out.println("Test to see if entered choice matches");
        ProgramMain test = new ProgramMain();
        Assert.assertTrue("Is there a matching choice", test.validChoice(2) );
    }
    @Test
    public void testIsEmpty()
    {
        System.out.println("Test to see if the list is empty");
        //String STR = "";
        ProgramMain.lVirtualCars.clear();
        Assert.assertNull("The object is empty", ProgramMain.lVirtualCars);
    }
    @Test
    public void testIsNotEmpty()
    {
        System.out.println("Test to see if the list not empty");
        //String STR = "";
        ProgramMain.lVirtualCars.add("Life");
        Assert.assertNotNull("The object is empty", ProgramMain.lVirtualCars);
    }
    @AfterClass
    public static void afterClass()
    {

    }
}
