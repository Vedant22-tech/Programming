class Logic
{
    void SumOfDigits(int Num)
    {
        int iDigits = 0;
        int iSum = 0;
        
        while(Num != 0)
        {
            iDigits = Num % 10;
            iSum = iSum + iDigits;
            Num = Num / 10;
        }
        System.out.println("The Summation of Digits : "+iSum);
    }
}

class Program76 
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.SumOfDigits(1234);
    }
    
}
