import java.util.*;

class Program148
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the character");
        char ch = sobj.next().charAt(0);

        CharacterX obj = new CharacterX();
        char c = obj.ToUpper(ch);

        System.out.println("Character in upper case is :"+(c));
    }
}

class CharacterX
{
    public char ToUpper(char ch)
    {
        char c = Character.toUpperCase(ch);
        return c;
    }
}