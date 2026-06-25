class Logic
{
    void FindMin(int a, int b, int c)
    {
        if(a < b && a < c)
        {
            System.out.println("Minimum is :"+a);
        }
        else if(b < a && b < c)
        {
            System.out.println("Minimum is :"+b);
        }
        else
        {
            System.out.println("Minimum is :"+c);
        }
    }
}

class Program79
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.FindMin(3,7,2);
    }
}