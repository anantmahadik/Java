import java.util.*;

class Program65
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        Digit dobj = new Digit();
        int iRet = dobj.MaxDigit(iNo);
        System.out.println("Max digit is :"+iRet);
    }
}

class Digit
{
    public int MaxDigit(int iNo)
    {
        int iDigit = 0;
        int iMax = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }
        while(iNo != 0)
        {

            iDigit = iNo % 10;
            iNo = iNo / 10;

            if(iDigit > iMax)
            {
                iMax = iDigit;
            }
        }
        return iMax;        
    }
}