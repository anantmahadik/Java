import java.util.*;

class Program23
{
    public static void main(String a[])
    {
        System.out.println("Enter number of iterations : ");
        Scanner sobj = new Scanner(System.in);
        int iNo = sobj.nextInt();

        Demo obj = new Demo();
        obj.Display(iNo);
    }
}

class Demo
{
    public void Display(int iValue)
    {
        for(int iCnt = 1; iCnt <= iValue; iCnt++)
        {
            System.out.println("Marvellous : "+iCnt);
        }
    }
}