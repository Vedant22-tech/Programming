class Logic
{
    void ProductOfDigits(int num)
    {
        int iDigits = 0;
        int iMul = 0;

        iMul =  1;

        while(num != 0)
        {
            iDigits = num % 10;

            iMul = iMul * iDigits;

            num = num / 10;
        }
        System.out.println("Product od digits is :"+iMul);
    }
}

class Program96
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.ProductOfDigits(234);
        
    }
    
}
