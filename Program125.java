import java.util.*;

class Program124
{
    public static void main(String a[])
    {
        char ich = ' ';
        int iASCCI = ich;
        for(int iCnt = 0; iCnt < 127; iCnt++)
        {
            iASCCI = ich;
            System.out.println("ASCII Values of "+ich+"is "+iASCCI);
            ich++;
        }
    }
}