import java.util.*;

class Program31
{
    public static void main(String a[])
    {
        System.out.println("Enter the number : ");
        Scanner sobj = new Scanner(System.in);
        int iNo = sobj.nextInt();

        Demo obj = new Demo();
        obj.DisplayFactors(iNo);

    }
}

class Demo
{
    void DisplayFactors(int iNo)
    {
        int iFact = 1;
        
        for(int iCnt = 1; iCnt < iNo; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}