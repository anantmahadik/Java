import java.util.*;
/*
    Row = 4
    Col = 4

    1   2   3   4
    1   2   3   4
    1   2   3   4
    1   2   3   4

*/
class Program101
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
        //code
    }
}