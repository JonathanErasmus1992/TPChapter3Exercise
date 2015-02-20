package za.ac.cput.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by student on 2015/02/20.
 */
public class MapAndLists {
    public static Map chooseCarOps = new HashMap();
    public void addListsToMap()
    {
        chooseCarOps.put("Car Manufacturers", listCarManu());
        chooseCarOps.put("Engine Sizes", listEngineSize());
        chooseCarOps.put("Car Classes", listCarClasses());
        chooseCarOps.put("Car Colours", listCarColours());
    }
    public List listCarManu()
    {
        List carManufacturers = new ArrayList();
        carManufacturers.add("Toyota");
        carManufacturers.add("Hyundai");
        carManufacturers.add("BMW");
        carManufacturers.add("Ford");
        carManufacturers.add("Mercedes");
        carManufacturers.add("Fiat");
        carManufacturers.add("Kia");
        carManufacturers.add("Honda");
        carManufacturers.add("Volkswagen");
        return carManufacturers;
    }
    public List listEngineSize()
    {
        List carEngineSize = new ArrayList();
        carEngineSize.add("1.2 lt");
        carEngineSize.add("1.4 lt");
        carEngineSize.add("1.6 lt");
        carEngineSize.add("1.8 lt");
        carEngineSize.add("2.0 lt");
        carEngineSize.add("2.4 lt");
        carEngineSize.add("2.6 lt");
        carEngineSize.add("3.0 lt");
        carEngineSize.add("3.5 lt");

        return carEngineSize;
    }
    public List listCarClasses()
    {
        List carClasses = new ArrayList();
        carClasses.add("Normal");
        carClasses.add("Family");
        carClasses.add("Sport");
        carClasses.add("Off Road");
        carClasses.add("Economy");
        carClasses.add("Racing");
        return carClasses;
    }
    public List listCarColours()
    {
        List carColours = new ArrayList();
        carColours.add("White");
        carColours.add("Black");
        carColours.add("Blue");
        carColours.add("Red");
        carColours.add("Green");
        carColours.add("Pink");
        carColours.add("Chrome");
        carColours.add("Champagne");
        return carColours;
    }
}
