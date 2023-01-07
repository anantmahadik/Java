import java.util.*;

class Program51
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number  ");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();
        int iRet = dobj.CountDigits(iNo);
        System.out.println("Number of digits is :"+iRet );
    }
}

class Digits
{
    int CountDigits(int iNo)
    {
        int iDigit = 0;
        int iCnt = 0;
        
        if(iNo == 0)
        {
            return 1;
        }

        if(iNo > 0)
        {
            iNo = -iNo;
        }
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iNo = iNo / 10;
            iCnt++;
        }
        return iCnt;
    }
}