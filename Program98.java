class Logic
{
    void DisplayFactor(int n)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= n/2; iCnt++)
        {
            if(n % iCnt == 0)
            {
                System.out.println("Factors are : "+iCnt);
            }
        }
        
    }
}

class Program98
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.DisplayFactor(12);
    }   
}
