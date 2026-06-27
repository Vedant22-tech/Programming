class Logic
{
    void PrintReverse(int n)
    {
        int iCnt = 0;

        for(iCnt = n; iCnt >= 1; iCnt--)
        {
            System.out.print(iCnt+"\t");
        }
    }
}

class Program92
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.PrintReverse(10);
    }   
}
