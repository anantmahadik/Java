import java.util.*;

class Program45
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter number");
        int iNo = sobj.nextInt();

        Demo obj = new Demo();
        obj.DisplayOddFactors(iNo);
    }
}

class Demo
{
    public void DisplayOddFactors(int iNo)
    {
        
        for(int iCnt = 1; iCnt < iNo/2; iCnt = iCnt+2)
        {
            if(iNo % iCnt == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}