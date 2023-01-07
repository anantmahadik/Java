import java.util.*;

class Program34
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number");
        int iNo = sobj.nextInt();

        Factors fobj = new Factors();
        boolean bRet = fobj.CheckPerfect(iNo);

        if(bRet == true)
        {
            System.out.println(iNo+"is a perfect number");
        }
        else
        {
            System.out.println(iNo+"is not a perfect number");
        }

    }
}

class Factors
{
    int SumFactors(int iNo)
    {
        int iSum = 0;
        for(int iCnt = 1; iCnt < iNo/2; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
    }

    boolean CheckPerfect(int iData)
    {
        int iAns = 0;
        iAns = SumFactors(iData);
        if(iAns == iData)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}