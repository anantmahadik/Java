import java.util.*;

class Program128
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the character :");
        char ch = sobj.next().charAt(0);

        CharacterX cobj = new CharacterX();
        boolean  bRet = cobj.IsCapital(ch);
        if(bRet == true)
        {
            System.out.println(ch+" is Upper case latter");
        }
        else
        {
            System.out.println(ch+" is not upper case latter");
        }
    }
}

class CharacterX
{
    public boolean IsCapital(char ch)
    {
        if((ch >= 'A') && (ch <= 'Z'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}