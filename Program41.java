import java.util.*;

class Program41
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter number");
        int iNo = sobj.nextInt();

        Demo obj = new Demo();
        obj.DisplayEvenFactors(iNo);
    }
}

class Demo
{
    public void DisplayEvenFactors(int iNo)
    {
        
        for(int iCnt = 1; iCnt < iNo; iCnt++)
        {
            if(iNo % iCnt == 0 && iCnt % 2 == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}