package za.ac.cput.project;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/02/20.
 */
public class TestMapAndLists {
    @BeforeClass
    public static void beforeClass()
    {

    }
    @Test
    public void testCarManuList()
    {
        System.out.println("Check if CarManu list is not null");
        //List testList = new ArrayList();
        MapAndLists test = new MapAndLists();
        Assert.assertNotNull(test.listCarManu());
    }
    @Test
    public void testEngineSList()
    {
        System.out.println("Check if EngineS list is not null");
        //List testList = new ArrayList();
        MapAndLists test = new MapAndLists();
        Assert.assertNotNull(test.listEngineSize());
    }
    @Test
    public void testCarClassList()
    {
        System.out.println("Check if CarClass list is not null");
        //List testList = new ArrayList();
        MapAndLists test = new MapAndLists();
        Assert.assertNotNull(test.listCarClasses());
    }
    @Test
    public void  testCarColourList()
    {
        System.out.println("Check if CarColour list is not null");
        //List testList = new ArrayList();
        MapAndLists test = new MapAndLists();
        Assert.assertNotNull(test.listCarColours());
    }
    @AfterClass
    public static void afterClass()
    {

    }
}
