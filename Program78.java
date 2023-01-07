import java.util.*;

class Program78
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

        System.out.println("Enter the occerence number :");
        int iOcr = sobj.nextInt();

        System.out.println("Your entered elements is ");
        for(int i = 0; i < Arr.length; i++)
        {
            System.out.println(i+1+" number element is "+Arr[i]);
        }

        ArrayX obj = new ArrayX();
        int iRet = obj.CalculateFrequency(Arr,iOcr);
        System.out.println("Number of occerence is :"+iRet);

    }
}

class ArrayX
{
    public int CalculateFrequency(int Arr[], int iOcr)
    {
        int iEvenSum = 0, iOddSum = 0, iOcrCnt = 0;
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == iOcr)
            {
                iOcrCnt++;
            }
        }
        return iOcrCnt;
    }
}