package za.ac.cput.project;

import javax.swing.*;

/**
 * Created by student on 2015/02/19.
 */
public class AddOns {

    public String addOnsMenu()
    {
        String[] addons = {"Air-Con", "DVD Player", "Tinted Windows", "Sun Roof", "Sound System", "Mags"};
        String strAddons = "";
        strAddons = ( String ) JOptionPane.showInputDialog(null, "Please Choose The Add-On You Want", "Choose Add On", JOptionPane.QUESTION_MESSAGE,
                null, addons, addons[0]);
        return strAddons;
    }
}
