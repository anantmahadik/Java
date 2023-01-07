import java.util.*;

class Program17
{
    public static void main(String a[])
    {
        int iNo = 0;
        System.out.println("Enter number of iterations :");
        Scanner sobj = new Scanner(System.in);
        iNo = sobj.nextInt();

        Demo obj = new Demo();
        obj.Display(iNo);
    }
}

class Demo
{
    public void Display(int iValue)
    {
        for(int iCnt = 0; iCnt <= iValue; iCnt++)
        {
            System.out.println("Jay Ganesh...");
        }
    }
}