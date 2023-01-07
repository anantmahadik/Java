import java.util.*;

class Program28
{
    public static void main(String a[])
    {

        Demo obj = new Demo();
        int iRet = obj.Summation();

        System.out.println("Summation is : "+iRet);
    }
}

class Demo
{
    int Summation()
    {

        int iSum = 0;

        for(int iCnt = 0; iCnt <= 5; iCnt++)
        {
            iSum = iSum + iCnt;
        }

        return iSum;
    }

}