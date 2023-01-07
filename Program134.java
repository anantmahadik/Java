import java.util.*;

class Program134
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        char Arr[] = new char[50];

        
        System.out.println("Enter your full name :");
        Arr = sobj.next().toCharArray();

        CharacterArray cobj = new CharacterArray();
        cobj.Strlength(Arr);
    }
}

class CharacterArray
{
    public void Strlength(char Arr[])
    {
        int iCnt = 0;
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
        System.out.println("Entered array character length is"+iCnt);

    }
}