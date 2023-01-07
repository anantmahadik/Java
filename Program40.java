import java.util.*;

class Program40
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
        int iCnt = iNo;
        while(iCnt > 0)
        {
            System.out.println(iCnt);
            iCnt--;
        }
        
    }

}