import java.util.*;

class Program33
{
    public static void main(String a[])
    {
        System.out.println("Enter the number : ");
        Scanner sobj = new Scanner(System.in);
        int iNo = sobj.nextInt();

        Demo obj = new Demo();
        int iRet = obj.SumFactors(iNo);

        System.out.println("Summation of factors is :"+iRet);
    }
}

class Demo
{
    int SumFactors(int iNo)
    {
        int iSum = 0;
        for(int iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
    }
}