import java.util.*;

class Program139
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        char Arr[] = new char[50];

        
        System.out.println("Enter string :");
        Arr = sobj.next().toCharArray();

        CharacterArray cobj = new CharacterArray();
        int iRet = cobj.CountCh(Arr);
        System.out.println("Entered string a,A count is "+iRet);
    }
}

class CharacterArray
{
    public int CountCh(char Arr[])
    {
        int iCnt = 0,iCount = 0;
        while(iCnt < Arr.length)
        {
            if(Arr[iCnt] == 'a' || Arr[iCnt] == 'A')
            {
                iCount++;
            }
            iCnt++;
        }
        return iCount;

    }
}