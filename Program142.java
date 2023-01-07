import java.util.*;

class Program142
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        char Arr[] = new char[50];
        char ch;
        
        System.out.println("Enter string :");
        Arr = sobj.next().toCharArray();

        
        CharacterArray cobj = new CharacterArray();
        int iRet = cobj.CounFrequecny(Arr,'a');
        System.out.println("Frequency of latters is "+iRet);
    }
}

class CharacterArray
{
    public int CounFrequecny(char Arr[],char ch)
    {
        int iCnt = 0,iCount = 0;
        while(iCnt < Arr.length)
        {
            if(Arr[iCnt] == ch)
            {
                iCount++;
            }
            iCnt++;
        }
        return iCount;
    }
}