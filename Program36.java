import java.util.*;

class Program36
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter number");
        int iNo = sobj.nextInt();

        Demo obj = new Demo();
        obj.NonFactors(iNo);

    }
}

class Demo
{
    public void NonFactors(int iNo)
    {
        for(int iCnt = 1; iCnt < iNo; iCnt++)
        {
            if((iNo % iCnt) != 0 )
            {
                System.out.print(iCnt+"\t");
            }
        }
    }

}