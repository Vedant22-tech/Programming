class Logic
{
    void CountEvenOddRange(int n)
    {
        int iCnt = 0;
        int iSumEvenCount = 0;
        int iSumOddCount = 0;

        for(iCnt = 0; iCnt <= n; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iSumEvenCount++;
            }
            else
            {
                iSumOddCount++;
            }
        }
        System.out.println("Even Count :"+iSumEvenCount);
        System.out.println("Even Count :"+iSumOddCount);

    }
}

class Program97
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.CountEvenOddRange(50);
    }   
}
