import java.util.*;

class Program6
{
    public static void main(String a[])
    {
        int iAns = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter first value");
        int iNo1 = sobj.nextInt();
        
        System.out.println("Enter second value");
        int iNo2 = sobj.nextInt();

        iAns = iNo1 * iNo2;

        System.out.println("Multiplication is :"+iAns);
    }
}
