import java.util.*;
/*
    Row = 6
    Col = 6

    $   $   $   $   $   $
    *   *   *   *   *   *
    *   *   *   *   *   *
    *   *   *   *   *   *
    *   *   *   *   *   *             
    $   $   $   $   $   $

*/

class Program116
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter number of columns");
        int iNo2 = sobj.nextInt();


        PatternX obj = new PatternX();
        obj.Display(iNo1,iNo2);
    }
}

class PatternX
{
    public void Display(int iNo1, int iNo2)
    {
        if(iNo1 != iNo2)
        {
            System.out.println("Row and column numbers are different");
            return;
        }
        for(int i = 1; i <= iNo1; i++)
        {
            for(int j = 1; j <= iNo2; j++)
            {
                if(i == 1)
                {
                    System.out.print("$\t");    
                }
                else if(i == iNo1)
                {
                    System.out.print("$\t");
                }
                else
                {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}