import java.util.*;

class Program38
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter number");
        int iNo = sobj.nextInt();

        Demo obj = new Demo();
        obj.DisplayTable(iNo);
    }
}

class Demo
{
    public void DisplayTable(int iNo)
    {
        
        for(int iCnt = 1; iCnt < 10; iCnt++)
        {
            System.out.println(iCnt * iNo);
        }
        
    }

}