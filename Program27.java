import java.util.*;

class Program27
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

        iSum = iSum + 1;
        iSum = iSum + 2;
        iSum = iSum + 3;
        iSum = iSum + 4;
        iSum = iSum + 5;

        return iSum;
    }

}