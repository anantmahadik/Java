import java.util.*;

class Program58
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number  ");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();
        int iRet = dobj.Reverse(iNo);
        System.out.println("Reverse number is :"+iRet);
    }
}

class Digits
{
    int Reverse(int iNo)
        {
        int iDigit = 0, iRev = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iRev = (iRev * 10) + iDigit;
            iNo = iNo / 10;
        }
        return iRev;
    }

}