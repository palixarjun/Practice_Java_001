import javax.swing.*;

public class InputJFrame {
    public static void main(String[] args){
    String str, str2;
    int x;
    JFrame myWindow;
    myWindow = new JFrame();
    myWindow.setSize(300,300);
    myWindow.setTitle("JFrame Input Check");
    myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myWindow.setVisible(true);
    str = JOptionPane.showInputDialog(myWindow, "Enter your name :");
    JOptionPane.showMessageDialog(myWindow, "Hello " +str);
    JOptionPane.showMessageDialog(myWindow, "Let us find out if the number is odd or even");
    str2 = JOptionPane.showInputDialog(myWindow, "Enter the number :");
    x = Integer.parseInt(str2);
    if(x%2==0)
    {
        if (x==0)
        {
            JOptionPane.showMessageDialog(myWindow, "This number you have entered is ZERO");
        }
        else
        {
            JOptionPane.showMessageDialog(myWindow, "This is you have entered is divisible by 2.");
        }
    }
    else
    {
        JOptionPane.showMessageDialog(myWindow, "This number is not divisible by 2");
    }
}
}
