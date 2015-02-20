package za.ac.cput.project;

import javax.swing.*;
import java.util.Scanner;

/**
 * Created by student on 2015/02/20.
 */
public class ProgramMain {
    public void programMain()
    {
        System.out.println("*****Calculate Your Interest On Loans*****");
        String choice = "";
        while( !choice.equals("4") ) {
            System.out.println("1. Student\t\t2. Employee");
            System.out.println("3. Pensioner\t\t4. Close");
            System.out.println("Please select an option: ");
            Scanner input = new Scanner(System.in);
            choice = input.nextLine();
            if (choice.equals("1"))
            {
                CalculateInterest calc = new Student();
                double amountDue = calc.calculateInterest();
                JOptionPane.showMessageDialog(null, "Amount Due After Interest: R " + amountDue);
            }
            else if (choice.equals("2"))
            {
                CalculateInterest calc = new Employee();
                double amountDue = calc.calculateInterest();
                JOptionPane.showMessageDialog(null, "Amount Due After Interest: " + amountDue);
            }
            else if (choice.equals("3"))
            {
                CalculateInterest calc = new Pensioner();
                double amountDue = calc.calculateInterest();
                JOptionPane.showMessageDialog(null, "Amount Due After Interest: " + amountDue);
            }
            else if (isEmpty(choice))
            {
                JOptionPane.showMessageDialog(null, "Please enter an option 1 - 3.\nOr Enter 4 to terminate program.");
            }
        }
        JOptionPane.showMessageDialog(null, "Thank You For Using The Program");
    }
    public boolean isEmpty( String s)
    {
        if ( s == null)
        {
            return true;
        }
        else
            return false;
    }
}
