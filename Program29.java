import java.util.*;

class Program29
{
    public static void main(String a[])
    {
        System.out.println("Enter the number : ");
        Scanner sobj = new Scanner(System.in);
        int iNo = sobj.nextInt();

        Demo obj = new Demo();
        int iRet = obj.Summation(iNo);

        System.out.println("Summation is : "+iRet);
    }
}

class Demo
{
    int Summation(int iNo)
    {

        int iSum = 0;

        for(int iCnt = 0; iCnt <= iNo; iCnt++)
        {
            iSum = iSum + iCnt;
        }

        return iSum;
    }

}