import java.util.*;

class Program149
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the character");
        char ch = sobj.next().charAt(0);

        CharacterX obj = new CharacterX();
        char c = obj.ToLower(ch);

        System.out.println("Character in upper case is :"+(c));
    }
}

class CharacterX
{
    public char ToLower(char ch)
    {
        if(ch >= 'a' && ch <= 'z');
        {
            char c = Character.toUpperCase(ch);
            return c;
        }
        else if(ch >= 'A' && ch <= 'Z');
        {
            char c = Character.toLowerCase(ch);
            return c;
        }
        else
        {
            return c;   
        }
    }
}