import java.util.*;

class Program10
{
    public static void main(String a[])
    {
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number :");
        int iNo1 = sobj.nextInt();

        Division dobj =new Division();
        int iRet = dobj.DivByFiveAndThree(iNo1);

        if(iRet == 0)
        {
            System.out.println("Divisible by five and three ");
        }
        else
        {
            System.out.println("Divisible by not five and three");
        }
    }
}

class Division
{
    int iRet = 0;

    int DivByFiveAndThree(int iNo1)
    {
        if(iNo1 % 5 == 0 && iNo1 % 3 == 0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
       
}