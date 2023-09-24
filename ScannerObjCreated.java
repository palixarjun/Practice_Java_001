import java.util.*;
public class ScannerObjCreated
{
    public static void main ( String[] args)
    {
        int x;
        Scanner scanObj;
        scanObj = new Scanner(System.in);
        System.out.println("Enter the number:");
        x = scanObj.nextInt();
        scanObj.close();
        System.out.println("Entered number is "+x);
    }

}