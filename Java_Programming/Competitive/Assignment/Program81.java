class Logic
{
    void CheckPrime(int num)
    {
        int iCnt = 0;
        int iTemp = 0;

        iTemp = num/2;
        for(iCnt = 2; iCnt <= num/2; iCnt++)
        {
            if(num % iCnt == 0)
            {
                break;
            }
        }
        if(iCnt >= iTemp)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
    }
}

class Program81
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckPrime(11);
    }
}