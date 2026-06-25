class Logic
{
    void SumEvenOddDigits(int num)
    {
        int iDigits = 0;
        int iEvenSum = 0;
        int iOddSum = 0;

        while(num != 0)
        {
            iDigits = num % 10;
            if(iDigits % 2 == 0)
            {
                iEvenSum = iEvenSum + iDigits;
            }
            else if(iDigits % 2 != 0)
            {
                iOddSum = iOddSum + iDigits;
            }
            num = num / 10;
        }
        System.out.println("Even Sum of Digits :"+iEvenSum);
        System.out.println("Odd Sum of Digits :"+iOddSum); 
    }
}

class Program84
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.SumEvenOddDigits(123456);
    }
}