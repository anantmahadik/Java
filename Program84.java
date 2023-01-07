import java.util.*;

class Program84
{
    public static void main(String a[])
    {
        int Arr[];

        Scanner  sobj = new Scanner(System.in);
        System.out.println("Enter how many element");
        int iNo = sobj.nextInt();

        Arr = new int[iNo];
        System.out.println("Enter the "+iNo+"element");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        ArrayX obj = new ArrayX();
        obj.DisplayReverse(Arr);

    }
}

class ArrayX
{
    public void DisplayReverse(int Arr[])
    {
        
        for(int iCnt = Arr.length - 1; iCnt >= 0; iCnt--)
        {
            System.out.print(Arr[iCnt]+"\t");
        }
    }
}