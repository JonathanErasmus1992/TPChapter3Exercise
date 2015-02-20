package za.ac.cput.project;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by student on 2015/02/20.
 */
public class CarColours {
    public String carColours()
    {
        MapAndLists run = new MapAndLists();
        run.addListsToMap();
        ArrayList<String> CCs = (ArrayList)  MapAndLists.chooseCarOps.get("Car Colours");
        //System.out.println(CCs);
        Object[] carColour = CCs.toArray();

        String strCarColours = "White";
        strCarColours = ( String ) JOptionPane.showInputDialog(null, "Please Choose The Car Class You Want", "Choose Car Class", JOptionPane.QUESTION_MESSAGE,
                null, carColour, carColour[0]);
        return strCarColours;
    }
}
