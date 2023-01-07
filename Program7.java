import java.util.*;

class Program7
{
    public static void main(String a[])
    {
        int iAns = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter first value");
        int iNo1 = sobj.nextInt();
        
        System.out.println("Enter second value");
        int iNo2 = sobj.nextInt();

        Mult mobj = new Mult();

        iAns = mobj.Multiplication(iNo1,iNo2);
        

        System.out.println("Multiplication is :"+iAns);
    }
}

class Mult
{
    int iMult = 0;
    int Multiplication(int iNo1, int iNo2)
    {
        iMult = iNo1 * iNo2;
        return iMult; 
    }
       
}