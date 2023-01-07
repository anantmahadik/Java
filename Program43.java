import java.util.*;

class Program43
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
        for(int iCnt = 2; iCnt < iNo/2; iCnt=iCnt+2)
        {
            if(iNo % iCnt == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}