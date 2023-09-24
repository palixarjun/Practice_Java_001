import java.util.*;

import javax.swing.*;
public class DecimalFormatProgram {
    public static void main (String[] args)
    {
        JFrame myWindow;
        myWindow = new JFrame();
        String str1, str2;
        myWindow.setSize(300,200);
        myWindow.setTitle("Decimal Format Program");
        myWindow.setVisible(true);
        Date date;
        date = new Date();

        JOptionPane.showMessageDialog(myWindow, "Login Time "+date);
        str1 = JOptionPane.showInputDialog(myWindow, "Enter name :");
        str2 = JOptionPane.showInputDialog(myWindow, "Enter Password :");
        double x, y;
        x = Double.parseDouble(str1);
        y = Double.parseDouble(str2);
        if (x == 270204)
        {
            if (y == 2203)
            {
                JOptionPane.showMessageDialog(myWindow, "Hello Username: ArjunPali");
                JOptionPane.showMessageDialog(myWindow, "What do you want to find out ?\n 1. Area of Circle \n 2. Area of Triangle \n 3. Area of Rectangle \n 4. Area of Square \n 5. Area of Parallelogram ");
                int x1;
                String str3;
                str3 = JOptionPane.showInputDialog(myWindow, "Enter the choice :");
                x1 = Integer.parseInt(str3);
                if (x1 == 1)
                {
                    JOptionPane.showMessageDialog(myWindow, "Success");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(myWindow, "Entered Password is incorrect.");
            }
        }
        else 
        {
            JOptionPane.showMessageDialog(myWindow, "Please check the entered username.");
        }
    }
}
