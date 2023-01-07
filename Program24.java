import java.util.*;

class Program24
{
    public static void main(String a[])
    {
        System.out.println("Enter number of iterations : ");
        Scanner sobj = new Scanner(System.in);
        int iNo = sobj.nextInt();

        Demo obj = new Demo();
        obj.Display(iNo);
    }
}

class Demo
{
    public void Display(int iValue)
    {
        int iCnt = 1;
        while(iCnt <= iValue)
        {
            System.out.println("Marvellous : "+iCnt);
            iCnt++;
        }
    }
}