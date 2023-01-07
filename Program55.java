import java.util.*;

class Program55
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number  ");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();
        int iRet = dobj.CountEvenDigits(iNo);
        System.out.println("Number of digits is :"+iRet);
    }
}

class Digits
{
    int CountEvenDigits(int iNo)
    {
        int iDigit = 0;
        int iEvenCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit % 2 == 0)
            {
                iEvenCnt++;            
            }
            iNo = iNo / 10;
            
        }
        return iEvenCnt;
    }
}