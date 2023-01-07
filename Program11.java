import java.util.*;

class Program11
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
        int iAns1 = iNo1 % 5;
        int iAns2 = iNo1 % 3;

        if(iAns1 == 0 && iAns2 == 0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
       
}