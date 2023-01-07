import java.util.*;

class Program140
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        char Arr[] = new char[50];

        
        System.out.println("Enter string :");
        Arr = sobj.next().toCharArray();

        CharacterArray cobj = new CharacterArray();
        int iRet = cobj.CountSmall(Arr);
        System.out.println("Frequency of smalll latters is "+iRet);
    }
}

class CharacterArray
{
    public int CountSmall(char Arr[])
    {
        int iCnt = 0,iCount = 0;
        while(iCnt < Arr.length)
        {
            if(Arr[iCnt] >= 'a' && Arr[iCnt] <= 'z')
            {
                iCount++;
            }
            iCnt++;
        }
        return iCount;
    }
}