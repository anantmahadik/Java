import java.util.*;

class Program86
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

        System.out.println("Enter occerence number ");
        int iOcr = sobj.nextInt();

        ArrayX obj = new ArrayX();
        int iRet = obj.LastOccerence(Arr,iOcr);
        System.out.println("Last occerence is :"+iRet);
    }
}

class ArrayX
{
    public int LastOccerence(int Arr[],int iOcr)
    {
        int iCnt = 0;   
        for(iCnt = Arr.length-1; iCnt >= 0 ; iCnt--)
        {
            if(Arr[iCnt] == iOcr)
            {
                break;
            }
        }
        return iCnt;
    }
}