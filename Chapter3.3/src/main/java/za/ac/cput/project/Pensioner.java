package za.ac.cput.project;

import javax.swing.*;

/**
 * Created by student on 2015/02/20.
 */
public class Pensioner implements CalculateInterest {
    @Override
    public double calculateInterest()
    {
        String strAmount = JOptionPane.showInputDialog(null, "Please enter the loan amount: R", "Loan Amount", JOptionPane.PLAIN_MESSAGE);
        double amount = Float.parseFloat(strAmount);
        double interestAmount = amount * 0.24;
        return amount + interestAmount;
    }
}
