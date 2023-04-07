import java.util.*;

class Program162
{
    public static void main(String a[])
    {

        ArrayX obj = new ArrayX(5);

        obj.Accept();
        obj.Display();
    }
}

class ArrayX
{
    public int Arr[];

    public ArrayX(int iSize)
    {
        Arr =  new int[iSize];
    }

    public void Accept()
    {
        System.out.println("Enter the "+Arr.length+" element :");
        Scanner sobj = new Scanner(System.in);
        
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println("Enter the element no: "+(iCnt + 1));
            Arr[iCnt] = sobj.nextInt(); 
        }

    }
    
    public void Display()
    {
        System.out.println("Elements are:");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.print(Arr[iCnt]+"\t");
        }
        System.out.println();
    }
}