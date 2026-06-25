class Logic
{
    void printOddNumbers(int n)
    {
        int iCnt = 0;
        for(iCnt = 0; iCnt < n; iCnt++)
        {
            if(iCnt % 2 != 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class Program83
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.printOddNumbers(20);
    }
}