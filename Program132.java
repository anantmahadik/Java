import java.util.*;

class Program132
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        char Arr[] = new char[50];
        
        System.out.println("Enter your full name :");
        Arr = sobj.next().toCharArray();
        
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

    }
}