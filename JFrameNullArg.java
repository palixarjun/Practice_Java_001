import javax.swing.*;
public class JFrameNullArg
{
    public static void main ( String[] args)
    {
        JFrame myWindow;
        myWindow = new JFrame();
        myWindow.setSize(300,200);
        myWindow.setTitle("JFrame Program 2");
        myWindow.setVisible(true);
        JOptionPane.showMessageDialog(myWindow, "This is supported with JFrame Arguement");
        JOptionPane.showMessageDialog(null,"This is supported with null arguement");
    
    }
}