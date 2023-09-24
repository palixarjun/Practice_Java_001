/* A program that seeks username and password
followed by the enteries to find the area and perimeter of the 2 dimensional objects
and lateral surface area, curve surface area and volume of the 3 dimensional objects
*/

import javax.swing.*;

public class DimensionalCalculator
{
    public static void main (String [] args)
    {
        JFrame myWindow;
        myWindow = new JFrame();
        myWindow.setSize(300,200);
        myWindow.setTitle("Dimensional_Calculator");
        myWindow.setVisible(false);
        JOptionPane.showMessageDialog(myWindow, "Hello dear user, \n This is program to find the generalised \n calculations on the 2d and 3d objects.");
        String Str1, Str2;
        String Str3 = "ArjunPali";
        String Str4 = "PasskeyValid";
        Str1 = JOptionPane.showInputDialog(myWindow, "Enter the Username");
        Str2 = JOptionPane.showInputDialog(myWindow, "Enter the Password");

        if (Str3.equals(Str1) && Str4.equals(Str2))
        {
            JOptionPane.showMessageDialog(myWindow, "Success");
            JOptionPane.showMessageDialog(myWindow, "Hello Dear User");
            JOptionPane.showMessageDialog(myWindow, "Code For 2D objects : 2D \nCode For 3D objects : 3D");
            String Input1 = JOptionPane.showInputDialog(myWindow, "Enter the code ");
            String str_2d = "2D";
            String str_3d = "3D";
            if (str_2d.equals(Input1))
            //2D Object Panel
            {
                JOptionPane.showMessageDialog(myWindow, "Currently we have in 2D objects \n1. Circle \n2.Square \n3.Triangle \n4.Rectangle ");
            }
            else if(str_3d.equals(Input1))
            {
                JOptionPane.showMessageDialog(myWindow, "Currently we have is 3D Objects \n1.Cube \n2.Cuboid \n3.Cylinder");
            }
            else
            {
                JOptionPane.showMessageDialog(myWindow, "Invalid Choice");
            }


        }
        else
        {
            JOptionPane.showMessageDialog(myWindow, "Password Incorrect");
        }
    }
}