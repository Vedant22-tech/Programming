class Logic
{
    void CheckPerfect(int n)
    {
        int iCnt = 0;
        int iSum = 0;
        int iTemp = 0;

        for(iCnt = 1; iCnt <= n/2; iCnt++)
        {
            if(n % iCnt == 0)
            {
                iSum = iSum + iCnt; 
            }
        }

        iTemp = n;
        if(iTemp == iSum)
        {
            System.out.println("Number is perfect");
        }
        else
        {
            System.out.println("Not Perfect");
        }
        
    }
}

class Program93
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.CheckPerfect(6);
    }   
}
