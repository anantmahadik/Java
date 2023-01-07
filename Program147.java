import java.util.*;

class Program147
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the character");
        char ch = sobj.next().charAt(0);
        char c = Character.toUpperCase(ch);
        System.out.println("Character in upper case is :"+(c));
    }
}
