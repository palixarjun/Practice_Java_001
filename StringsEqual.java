import javax.swing.*;

public class StringsEqual
{
public static void main(String [] args) {

JFrame myWindow;
myWindow = new JFrame();
myWindow.setSize(300,200);
myWindow.setTitle("String Equals");
myWindow.setVisible(true);

String str;
String str1;
String str2;
String str3;
str1 = "Arjun";
str = JOptionPane.showInputDialog(myWindow, "Enter the String value");
if (str1.equals(str))
{
JOptionPane.showMessageDialog(myWindow, "Success");
}
else
{
JOptionPane.showMessageDialog(myWindow, "Fail");
}

str3 = "Pali";
str2 = JOptionPane.showInputDialog("Enter string2 value :");

if( (str1.equals(str)) && (str3.equals(str2)) )
{
JOptionPane.showMessageDialog(myWindow, "success 2");
}
else
{
JOptionPane.showMessageDialog(myWindow, "Fail");
}
}
}