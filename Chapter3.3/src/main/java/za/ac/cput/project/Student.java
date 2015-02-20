package za.ac.cput.project;

import javax.swing.*;
import java.util.Scanner;

/**
 * Created by student on 2015/02/20.
 */
public class Student implements CalculateInterest {
    @Override
    public double calculateInterest()
    {
        String strAmount = JOptionPane.showInputDialog(null, "Please enter the loan amount: R", "Loan Amount", JOptionPane.PLAIN_MESSAGE);
        double amount = Float.parseFloat(strAmount);
        double interestAmount = amount * 0.18;
        return amount + interestAmount;
    }
}
