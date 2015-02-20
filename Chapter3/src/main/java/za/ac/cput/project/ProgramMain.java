package za.ac.cput.project;

import za.ac.cput.project.CreateMenu;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by student on 2015/02/19.
 */
public class ProgramMain {
    public static List lVirtualCars = new ArrayList();
    public void startPage()
    {
        System.out.println("\t\t**************Welcome to Create Your Own Virtual Car**************\n\n");
        int choice = 0;
        while( choice != 3 )
        {
            System.out.println("1. Create A Virtual Car");
            System.out.println("2. View Virtual Cars");
            System.out.println("3. Exit");
            System.out.println("Please Select An Option: ");
            Scanner input = new Scanner(System.in);
            String strChoice = input.nextLine();
            choice = Integer.parseInt(strChoice);
            if ( validChoice(choice) == false )
            {
                JOptionPane.showMessageDialog(null, "Please Select A Valid Option From The Choices Provided");
                System.out.println();
                System.out.println();
                System.out.println("1. Create A Virtual Car");
                System.out.println("2. View Virtual Cars");
                System.out.println("3. Exit");
                System.out.println("Please Select An Option: ");
                input = new Scanner(System.in);
                strChoice = input.nextLine();
                choice = Integer.parseInt(strChoice);
            }
            else
            {
                if ( choice == 1 )
                {
                    CreateMenu run = new CreateMenu();
                    run.createMenu();
                }
                else if( choice == 2 )
                {
                    //System.out.println("The list is empty?   " + isEmpty(lVirtualCars));
                    if (isEmpty(lVirtualCars))
                    {
                        JOptionPane.showMessageDialog(null, "The Virtual Cars List Currently Empty");
                    }
                    else
                    {
                        System.out.println("\t\t*****List of Virtual Cars Created*****\t\t");
                        for ( int i = 0; i < lVirtualCars.size(); i++)
                        {
                            int num = i + 1;
                            System.out.println( num + ".\t" + lVirtualCars.get(i));
                        }
                        System.out.println("\t\t*****List of Virtual Cars Created*****\t\t");
                    }
                }
            }
            System.out.println();
        }
        JOptionPane.showMessageDialog(null, "Thank You For Using The Application");
    }
    public boolean validChoice(int c)
    {

        if ( (c != 1) && (c != 2) && (c != 3) )
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean isEmpty( List l)
    {
        if (l.isEmpty() == true)
        {
            return true;
        }
        else
            return false;
    }
}
