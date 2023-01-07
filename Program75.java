import java.util.*;

class Program75
{
    public static void main(String a[])
    {
        int Arr[];
        

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter how many element :");
        int iNo = sobj.nextInt();

        Arr = new int[iNo];

        System.out.println("Enter  "+iNo+"  elements");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Your entered elements is ");
        for(int i = 0; i < Arr.length; i++)
        {
            System.out.println(i+1+" number element is "+Arr[i]);
        }

        ArrayX obj = new ArrayX();
        obj.DisplayEvenOddCount(Arr);
        

    }
}

class ArrayX
{
    public void DisplayEvenOddCount(int Arr[])
    {
        int iEvenCnt = 0, iOddCnt = 0, iAns = 0;
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 2 == 0)
            {
                iEvenCnt++;
            }
        }
        iAns = Arr.length - iEvenCnt;
        System.out.println("Number of even elements is : "+iEvenCnt);
        System.out.println("Number of odd element is : "+iAns);

    }
}