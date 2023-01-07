import java.util.*;

class Program56
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number  ");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();
        dobj.CountEvenOddDigits(iNo);
        
    }
}

class Digits
{
    void CountEvenOddDigits(int iNo)
    {
        int iDigit = 0;
        int iEvenCnt = 0;
        int iOddCnt = 0;

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
            else
            {
                iOddCnt++;
            }
            iNo = iNo / 10;
            
        }
        System.out.println("Number of even digits is :"+iEvenCnt);
        System.out.println("Number of odd digits is :"+iOddCnt);
    }
}