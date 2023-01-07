import java.util.*;

class Program30
{
    public static void main(String a[])
    {
        System.out.println("Enter the number : ");
        Scanner sobj = new Scanner(System.in);
        int iNo = sobj.nextInt();

        Demo obj = new Demo();
        int iRet = obj.Factorial(iNo);

        System.out.println("Summation is : "+iRet);
    }
}

class Demo
{
    int Factorial(int iNo)
    {
        int iFact = 1;
        
        for(int iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iFact = iFact * iCnt;
        }
        return iFact;
    }
}