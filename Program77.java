import java.util.*;

class Program77
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
        obj.DisplayEvenOddSum(Arr);
        

    }
}

class ArrayX
{
    public void DisplayEvenOddSum(int Arr[])
    {
        int iEvenSum = 0, iOddSum = 0, iAns = 0;
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 2 == 0)
            {
                iEvenSum = iEvenSum + Arr[iCnt];
            }
            else
            {
                iOddSum = iOddSum + Arr[iCnt];
            }
        }
        
        System.out.println("Number of even elements sum is : "+iEvenSum);
        System.out.println("Number of odd element sum is : "+iOddSum);

    }
}