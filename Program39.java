import java.util.*;

class Program39
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
        
        for(int iCnt = iNo; iCnt > 0; iCnt--)
        {
            System.out.println(iCnt);
        }
        
    }

}