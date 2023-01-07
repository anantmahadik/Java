import java.util.*;

class Program52
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number  ");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();
        int iRet = dobj.CountDigits(iNo);
        System.out.println("Number of digits is :"+iRet);
    }
}

class Digits
{
    int CountDigits(int iNo)
    {
        int iDigit = 0;
        int iSum = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iNo = iNo / 10;
            iSum = iSum + iDigit;
        }
        return iSum;
    }
}