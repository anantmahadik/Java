import java.util.*;

class Program131
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
            System.out.println(ch+" is Digit");
        }
        else
        {
            System.out.println(ch+" is not a Digit");
        }
    }
}

class CharacterX
{
    public boolean IsCapital(char ch)
    {
        if((ch >= 48) && (ch <= 57))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}