class Logic
{
    void CalculatePower(int base, int exp)
    {
        int iCnt = 0;
        int iPower = 0;

        iPower = 1;
        for(iCnt = 1; iCnt <= exp; iCnt++)
        {
            iPower = iPower * base;
        }
        System.out.println("Power of No. is :"+iPower);
    }
}

class Program90
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.CalculatePower(2, 5);
    }   
}
