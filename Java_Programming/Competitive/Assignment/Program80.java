class Logic
{
    void PrintTable(int num)
    {
        int iCnt = 0;
        int iTable = 0;

        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            iTable = iCnt * num;
            System.out.println(iTable); 
        }
    }
}

class Program80
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.PrintTable(5);
    }
}