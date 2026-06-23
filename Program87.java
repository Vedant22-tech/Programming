class Logic
{
    void DisplayGrade(int marks)
    {
        if(marks > 90)
        {
            System.out.println("Grade is A+");
        }
        else if(marks > 80 && marks < 90)
        {
            System.out.println("Garde is A");
        }
        else if(marks > 70 && marks < 80)
        {
            System.out.println("Garde is B");
        }
        else if(marks > 60 && marks < 70)
        {
            System.out.println("Garde is C");
        }
        else if(marks > 50 && marks < 60)
        {
            System.out.println("Garde is D");
        }
        else
        {
            System.out.println("Study Hard...");
        }
    }
}

class Program87 
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.DisplayGrade(82);
    }   
}
