package za.ac.cput.project;

import javax.swing.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by student on 2015/02/19.
 */
public class CreateMenu {
    public void createMenu()
    {
        String mOption = "";
        String Manufacturer = "Toyota", Engine = "1.2 lt", Class = "Normal", Colour = "White";
        String strAddOns = "";
        Set sAddOns = new HashSet();
        while( mOption != "Create and Close")
        {
            String[] menuOptions = {"Choose Car Manufacturer", "Choose Car Engine", "Choose Car Class", "Choose Car Colour", "Choose Car Add-ons", "Create and Close"};
             mOption = ( String ) JOptionPane.showInputDialog(null, "Please Select A Car Option", "Choose Car Option", JOptionPane.QUESTION_MESSAGE,
                    null, menuOptions, menuOptions[0]);
            if (isVString(mOption) == false)
            {
                JOptionPane.showMessageDialog(null, "Please Select A Valid Option");
            }
            else
            {
                if (mOption == "Choose Car Add-ons")
                {
                    JOptionPane.showMessageDialog(null, "Please note that you can add multiple car add-ons to your virtual car");
                    AddOns run = new AddOns();
                    String strAddO = run.addOnsMenu();
                    //System.out.println(strAddO);
                    sAddOns.add(strAddO);
                    //System.out.println(sAddOns);
                }
                else if(mOption == "Choose Car Manufacturer")
                {
                    CarManufacturers run = new CarManufacturers();
                    Manufacturer = run.carManuMenu();
                }
                else if(mOption == "Choose Car Engine")
                {
                    EngineSizes run = new EngineSizes();
                    Engine = run.carEngineSizes();
                }
                else if(mOption == "Choose Car Class")
                {
                    CarClasses run = new CarClasses();
                    Class = run.carClasses();
                }
                else if(mOption == "Choose Car Colour")
                {
                    CarColours run = new CarColours();
                    Colour = run.carColours();
                }
                else if (mOption == "Create and Close")
                {
                    JOptionPane.showMessageDialog(null, "Car Created");
                    for (Iterator i = sAddOns.iterator(); i.hasNext();)
                    {
                        strAddOns = strAddOns + (String) i.next() + "\t";
                    }
                    System.out.println("\t\t*****New Virtual Car Created*****\t\t");
                    System.out.println("Manufacturer: " + Manufacturer + "\tEngine: " + Engine + "\tClass: " + Class + "\tColour: " + Colour);
                    System.out.println("Add Ons: " + strAddOns);
                    System.out.println("\t\t*****New Virtual Car Created*****\t\t");
                    ProgramMain.lVirtualCars.add("Manufacturer: " + Manufacturer + "\tEngine: " + Engine + "\tClass: " + Class + "\tColour: " + Colour + "\n\tAdd-Ons: " + strAddOns);
                }
            }
        }
    }
    public boolean isVString(String mo) {
        String MeOp = "";
        if (mo == MeOp) {
            return false;
        } else {
            return true;
        }
    }
}
