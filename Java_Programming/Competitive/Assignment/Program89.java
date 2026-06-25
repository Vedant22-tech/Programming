class Logic
{
    void PrintDigits(int num)
    {
        int iDigits = 0;

        while(num != 0)
        {
            iDigits = num % 10;
            System.out.println(iDigits);
            num = num / 10;
        }
    }
}

class Program89 
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.PrintDigits(9876);
        
    }
    
}
