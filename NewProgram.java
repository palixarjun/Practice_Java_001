//Scanner Object and Nested If Statement
import java.util.*;

public class NewProgram
{
    public static void main (String args[])
    {
        
        Scanner s = new Scanner(System.in);
        int x;
        System.out.println("Enter the Number:");
        x = s.nextInt();
        if (x%2==0)
        {
            if (x == 0)
            {
                System.out.println("The input number is 0");
            }

            else
            {
                System.out.println("The input number is divisible by 2.");
            }
        }
        else
        {
            System.out.println("The Given number is not divisible 2");
        }
    s.close();   
    }
}