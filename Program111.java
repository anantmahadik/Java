import java.util.*;
/*
    Row = 4
    Col = 4

    @   2   3   4
    1   @   3   4
    1   2   @   4
    1   2   3   @    

*/

class Program111
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
                if(i == j)
                {
                    System.out.print("@\t");    
                }
                else
                {
                    System.out.print(j+"\t");
                }
            }
            System.out.println();
        }
    }
}