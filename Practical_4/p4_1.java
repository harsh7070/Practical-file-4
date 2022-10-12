package Practical_4;
public class p4_1
{
    public static void main(String[] args)
    {
        try
        {
            int divideByZero = 5/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Can't divide by zero ");
        }
        System.out.println("21CE039_Harsh");
    }
}

