class Logic
{
    void PrintDivisibleBy2and3(int n)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            if(iCnt % 2 == 0 && iCnt % 3 ==0)
            {
                System.out.println(iCnt);
            }
        }
        
    }
}

class Program100
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.PrintDivisibleBy2and3(30);
    }   
}
