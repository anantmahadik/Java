import java.util.*;

class Program35
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number : ");
        int iNo = sobj.nextInt();

        Demo  dobj= new Demo();
        boolean bRet = dobj.CheckPerfect(iNo);

        if(bRet == true)
        {
            System.out.println(iNo+"is a perfect number");
        }        
        else
        {
            System.out.println(iNo+"is not a perfrct number");
        }
    }
}

class Demo
{
    boolean CheckPerfect(int iNo)
    {
        int iSum = 0;
        for(int iCnt = 1; iCnt < iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        if(iSum == iNo)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}