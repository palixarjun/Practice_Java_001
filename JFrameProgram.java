import javax.swing.*;
public class JFrameProgram 
{
    public static void main (String args[])
    {
        JFrame myWindow;
        myWindow = new JFrame();
        myWindow.setSize(300,200);
        myWindow.setTitle("JFrame Window");
        myWindow.setVisible(true);
        JOptionPane.showMessageDialog(myWindow, "My First Java Program");
    }
}