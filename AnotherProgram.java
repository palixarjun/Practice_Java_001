//Greatest Number
import java.util.*;

public class AnotherProgram
{
    public static void main(String args[])
    {
        int x, y, z;
        Scanner scanobject = new Scanner(System.in);
        System.out.print("\n Enter the Number 1 :");
        x = scanobject.nextInt();
        Scanner scanobject1 = new Scanner(System.in);
        System.out.print("\n Enter the Number 2 :");
        y = scanobject1.nextInt();
        Scanner scanobject2 = new Scanner(System.in);
        System.out.print("\n Enter the Number 3 :");
        z = scanobject2.nextInt();

        if (x>y)
        {
            if (z>x)
            {
                System.out.println("Number 3 input is greatest.");
            }
            else
            {
                System.out.println("Number 1 is the greatest.");
            }
        }
            else
            {
                if (z>y)
                {
                    System.out.println("Number 3 is Greatest.");
                }
                else
                {
                    System.out.println("Number 2 is greatest.");
                }
            }
    scanobject.close();
    scanobject1.close();
    scanobject2.close();
        
    }
}