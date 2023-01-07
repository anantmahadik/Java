import java.util.*;

class Program96
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
        char ch = 'A';
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(int iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print(ch+"\t");
            ch++;
        }
    }
}