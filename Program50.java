import java.util.*;

class Program50
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number");
        int iNo = sobj.nextInt();

        Demo dobj = new Demo();
        int iRet = dobj.CountDigitsX(iNo);
        System.out.println("Digit of count is "+iRet);
    }
}

class Demo
{
    int CountDigitsX(int iValue)
    {
        int iDigit = 0;
        int iCnt = 0;
        if(iValue == 0)
        {
            return 1;
        }

        if(iValue < 0)
        {
            iValue = -iValue;
        }
        
        while(iValue > 0 )
        {
            iDigit = iValue % 10;
            iValue = iValue / 10;
            iCnt++;
        }
        return iCnt;
    }
}