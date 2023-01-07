import java.util.*;

class Program137
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        char Arr[] = new char[50];

        
        System.out.println("Enter your full name :");
        Arr = sobj.next().toCharArray();

        CharacterArray cobj = new CharacterArray();
        int iRet = cobj.Strlength(Arr);
        System.out.println("Entered array character length is"+iRet);
    }
}

class CharacterArray
{
    public int Strlength(char Arr[])
    {
        int iCnt = 0;
        while(iCnt < Arr.length)
        {
            System.out.println(Arr[iCnt]);
            iCnt++;
        }
        return iCnt;

    }
}