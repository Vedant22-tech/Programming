class Logic
{
    void FindLargestdigit(int num)
    {
        int iDigits = 0;
        int iLarge = 0;

        while(num != 0)
        {
            iDigits = num % 10;
            if(iLarge < iDigits)
            {
                iLarge = iDigits;
            }
            num = num / 10;
        }
        System.out.println("Largest Digit :"+iLarge);
    }
}

class Program94
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.FindLargestdigit(83429);
        
    }
    
}
