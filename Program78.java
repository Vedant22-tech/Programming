class Logic
{
    void FindMax(int a, int b)
    {
        if(a > b)
        {
            System.out.println("This is Maximum :"+a);
        }
        else
        {
            System.out.println("This is Maximum"+b);
        }
    }
}

class Program78
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.FindMax(20,15);
    }
}