import java.util.*;

class Program98
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number");
        int iNo = sobj.nextInt();

        CharacterX obj = new CharacterX();
        obj.Display(iNo);
    }
}

class CharacterX
{
    public void Display(int iNo)
    {
        char ch = 'a';
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(int iCnt = 1; iCnt <= iNo; iCnt++,ch++)
        {
            System.out.print(ch+"\t");
        }
    }
}