import java.util.*;

class Program141
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        char Arr[] = new char[50];

        
        System.out.println("Enter string :");
        Arr = sobj.next().toCharArray();

        CharacterArray cobj = new CharacterArray();
        int iRet = cobj.CounCapital(Arr);
        System.out.println("Frequency of capital latters is "+iRet);
    }
}

class CharacterArray
{
    public int CounCapital(char Arr[])
    {
        int iCnt = 0,iCount = 0;
        while(iCnt < Arr.length)
        {
            if(Arr[iCnt] >= 'A' && Arr[iCnt] <= 'Z')
            {
                iCount++;
            }
            iCnt++;
        }
        return iCount;
    }
}