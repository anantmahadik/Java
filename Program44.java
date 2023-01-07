import java.util.*;

class Program44
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
        
        for(int iCnt = 1; iCnt < iNo/2; iCnt++)
        {
            if(iNo % iCnt == 0 && iCnt % 2 != 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}