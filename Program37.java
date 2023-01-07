import java.util.*;

class Program37
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter number");
        int iNo = sobj.nextInt();

        Demo obj = new Demo();
        int iRet = obj.SumNonFactors(iNo);
        System.out.println("Sum of non factors : "+iRet);

    }
}

class Demo
{
    public int SumNonFactors(int iNo)
    {
        int iSum = 0;
        for(int iCnt = 1; iCnt < iNo; iCnt++)
        {
            if((iNo % iCnt) != 0 )
            {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
    }

}