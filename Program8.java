import java.util.*;

class Program8
{
    public static void main(String a[])
    {
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number :");
        int iNo1 = sobj.nextInt();

        Division dobj =new Division();
        boolean bRet = dobj.DivByFive(iNo1);

        if(bRet == true)
        {
            System.out.println("Divisible by five ");
        }
        else
        {
            System.out.println("Divisible by not five");
        }
    }
}

class Division
{
    boolean bFlag = false;

    boolean DivByFive(int iNo1)
    {
        if(iNo1 % 5 == 0)
        {
            bFlag = true;
        }
        return bFlag;
    }
       
}