class Logic
{
    void CountFactor(int n)
    {
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 1; iCnt <= n/2; iCnt++)
        {
            if(n % iCnt == 0)
            {
                iCount++;
            }
        }
        System.out.println("Count of factors :"+iCount);
        
    }
}

class Program99
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.CountFactor(20);
    }   
}
