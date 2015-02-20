package za.ac.cput.project;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by student on 2015/02/20.
 */
public class EngineSizes {
    public String carEngineSizes()
    {
        MapAndLists run = new MapAndLists();
        run.addListsToMap();
        ArrayList<String> CES = (ArrayList)  MapAndLists.chooseCarOps.get("Engine Sizes");
        //System.out.println(CES);
        Object[] carEngineSizes = CES.toArray();

        String strEngineS = "1.2 lt";
        strEngineS = ( String ) JOptionPane.showInputDialog(null, "Please Choose The Engine Size You Want", "Choose Engine Size", JOptionPane.QUESTION_MESSAGE,
                null, carEngineSizes, carEngineSizes[0]);
        return strEngineS;
    }
}
