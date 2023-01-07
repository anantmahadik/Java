import java.util.*;

class Program143
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        char Arr[] = new char[50];
        
        
        System.out.println("Enter string :");
        Arr = sobj.next().toCharArray();

        System.out.println("Enter the character");
        char ch = sobj.next().charAt(0);
        
        CharacterArray cobj = new CharacterArray();
        int iRet = cobj.CounFrequecny(Arr,ch);
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