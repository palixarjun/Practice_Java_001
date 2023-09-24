import javax.swing.*;
import java.util.*;
import java.text.*;

public class JFrameProgram3
{
    public static void main ( String[]  args)
    {
        Date date;
        SimpleDateFormat simpleDate;
        JFrame myWindow;
        myWindow = new JFrame();
        myWindow.setSize(300,200);
        myWindow.setTitle("JFrame Program 3");
        myWindow.setVisible(true);
        date = new Date();
        simpleDate = new SimpleDateFormat("EEEE");
        JOptionPane.showMessageDialog(myWindow, " Today's date is " +date);
        JOptionPane.showMessageDialog(myWindow, "Today's day is" +simpleDate);


    }
}