import java.util.*;

class Program88
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number");
        int iNo = sobj.nextInt();

        Pattern obj = new Pattern();
        obj.Display(iNo);
    }
}

class Pattern
{
    public void Display(int iNo)
    {
        for(int iCnt = 1; iCnt < iNo; iCnt++)
        {
            System.out.print("*\t");
        }
        System.out.println();
    }
}