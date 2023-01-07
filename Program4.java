import java.util.*;

class Program4
{
    public static void main(String a[])
    {
        int iAns = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter first value");
        int iNo1 = sobj.nextInt();
        
        System.out.println("Enter second value");
        int iNo2 = sobj.nextInt();

        Demo obj = new Demo();
        iAns = obj.Addition(iNo1,iNo2);
        System.out.println("Addition is :"+iAns);
    }
}

class Demo
{
    int Addition(int iNo1, int iNo2)
    {
        return iNo1 + iNo2;
    }
}