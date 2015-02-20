package za.ac.cput.project;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

/**
 * Created by student on 2015/02/19.
 */
public class CarManufacturers {
    public String carManuMenu()
    {
        MapAndLists run = new MapAndLists();
        run.addListsToMap();
        ArrayList<String> CMO = (ArrayList)  MapAndLists.chooseCarOps.get("Car Manufacturers");
        //System.out.println(CMO);
        Object[] carManuOptions = CMO.toArray();
        // MapAndLists.chooseCarOps.get("Car Manufacturers")

        String strCarManu = "Toyota";
        strCarManu = ( String ) JOptionPane.showInputDialog(null, "Please Choose The Car Manufacturer You Want", "Choose Car Manufacturer", JOptionPane.QUESTION_MESSAGE,
                null, carManuOptions, carManuOptions[0]);
        return strCarManu;
    }
}
