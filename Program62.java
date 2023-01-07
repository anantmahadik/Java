import java.util.*;

class Program62
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number  ");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();
        boolean iRet = dobj.ChkPallindrome(iNo);
        if(iRet == true)
        {
            System.out.println("Number is pallindrome");
        }
        else
        {
            System.out.println("Number is not pallindrome");
        }        
    }
}

class Digits
{
    boolean ChkPallindrome(int iNo)
    {
        int iDigit = 0;
        int iTemp = iNo;
        int iRev = 0;

        for(;iNo != 0;)
        {
            iDigit = iNo % 10;
            iRev = (iRev * 10) + iDigit;
            iNo = iNo / 10;
        }

        if(iRev == iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}