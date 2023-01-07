import java.util.*;

class Program83
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
        int iRet = obj.Minimum(Arr);
        System.out.println("Minimum number is : "+iRet);
    }
}

class ArrayX
{
    public int Minimum(int Arr[])
    {
        int iMin = Arr[0];
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(iMin > Arr[iCnt])
            {
                iMin = Arr[iCnt];
            }
        }
        return iMin;
    }
}