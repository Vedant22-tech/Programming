class Logic
{
    void checkPalindrome(int num)
    {
        int iDigit = 0;
        int iRev = 0;
        int iTemp = 0;

        iTemp = num;

        while(num != 0)
        {
            iDigit = num % 10;
            iRev = iRev * 10 + iDigit;
            num = num / 10;
        }
        if(iTemp == iRev)
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome");
        }
    }
}

class Program77
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.checkPalindrome(121);
    }
}