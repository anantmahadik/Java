import java.util.*;

class Program66
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        Digit dobj = new Digit();
        int iRet = dobj.MinDigit(iNo);
        System.out.println("Min digit is :"+iRet);
    }
}

class Digit
{
    public int MinDigit(int iNo)
    {
        int iDigit = 0;
        int iMin = 9;

        if(iNo < 0)
        {
            iNo = -iNo;
        }
        while(iNo != 0)
        {

            iDigit = iNo % 10;
            iNo = iNo / 10;

            if(iDigit < iMin)
            {
                iMin = iDigit;
            }
        }
        return iMin;        
    }
}