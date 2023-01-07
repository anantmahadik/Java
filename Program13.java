import java.util.*;

class Program13
{
    public static void main(String a[])
    {
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number :");
        int iNo1 = sobj.nextInt();

        Division dobj =new Division();
        boolean iRet = dobj.DivByFiveAndThree(iNo1);

        if(iRet == true)
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

    boolean DivByFiveAndThree(int iNo)
    {
        if(iNo % 3 == 0)
        {
            if(iNo % 5 == 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    
       
}