import java.util.*;

class Program82
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
        int iRet = obj.Maximum(Arr);
        System.out.println("Maximum number is : "+iRet);
    }
}

class ArrayX
{
    public int Maximum(int Arr[])
    {
        int iMax = Arr[0];
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(iMax < Arr[iCnt])
            {
                iMax = Arr[iCnt];
            }
        }
        return iMax;
    }
}