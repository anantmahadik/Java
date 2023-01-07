import java.util.*;

class Program127
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the character :");
        char ch = sobj.next().charAt(0);

        CharacterX cobj = new CharacterX();
        boolean  bRet = cobj.CheckSmall(ch);
        if(bRet == true)
        {
            System.out.println(ch+" is small case latter");
        }
        else
        {
            System.out.println(ch+" is not small case latter");
        }
    }
}

class CharacterX
{
    public boolean CheckSmall(char ch)
    {
        if((ch >= 97) && (ch <= 122))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}