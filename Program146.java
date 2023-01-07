import java.util.*;

class Program146
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
        boolean bRet = cobj.CheckCharacter(Arr,ch);
        
        if(bRet == true)
        {
            System.out.println("Character is present in string");
        }
        else
        {
            System.out.println("Character is not present in string");
        }
    }
}

class CharacterArray
{
    public boolean CheckCharacter(char Arr[],char ch)
    {
        int iCnt = 0;

        while(iCnt < Arr.length)
        {
            if(Arr[iCnt] == ch)
            {
                return true;
            }
            iCnt++;
        }
        return false;  
    }
}