package za.ac.cput.project;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by student on 2015/02/20.
 */
public class CarClasses {
    public String carClasses()
    {
        MapAndLists run = new MapAndLists();
        run.addListsToMap();
        ArrayList<String> CC = (ArrayList)  MapAndLists.chooseCarOps.get("Car Classes");
        //System.out.println(CC);
        Object[] carClass = CC.toArray();

        String strCarClasses = "Normal";
        strCarClasses = ( String ) JOptionPane.showInputDialog(null, "Please Choose The Car Class You Want", "Choose Car Class", JOptionPane.QUESTION_MESSAGE,
                null, carClass, carClass[0]);
        return strCarClasses;
    }
}
