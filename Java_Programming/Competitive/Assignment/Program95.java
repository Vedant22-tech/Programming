class Logic
{
    void FindSmallestDigit(int num)
    {
        int iDigits = 0;
        int iSmall = 0;

        iSmall = num;

        while(num != 0)
        {
            iDigits = num % 10;

            if(iSmall > iDigits)
            {
                iSmall = iDigits;
            }
            num = num / 10;
        }
        System.out.println("Smallest Digit :"+iSmall);
    }
}

class Program95
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.FindSmallestDigit(45872);
        
    }
    
}
