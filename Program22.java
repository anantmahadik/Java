import java.util.*;

class Program22
{
    public static void main(String a[])
    {

        Demo obj = new Demo();
        obj.Display();
    }
}

class Demo
{
    public void Display()
    {
        for(int iCnt = 1; iCnt <= 5; iCnt++)
        {
            System.out.println("Marvellous : "+iCnt);
        }
    }
}