import java.util.*;

class Program25
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
        int iNo1 = 1;
        int iNo2 = 2;
        int iNo3 = 3;
        int iNo4 = 4;
        int iNo5 = 5;
        int iSum = 0;

        iSum = iNo1 + iNo2 + iNo3 + iNo4 + iNo5;

        return iSum;
    }

}