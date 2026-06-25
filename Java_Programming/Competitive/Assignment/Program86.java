class Logic
{
    void CheckLeapYear(int year)
    {
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
        {
            System.out.println("Year is leap Year");
        }
        else
        {
            System.out.println("Year is not a leap year");
        }
    }
}

class Program86
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.CheckLeapYear(2024);
    }
}
