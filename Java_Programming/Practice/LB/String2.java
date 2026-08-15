import java.util.*;

class String2
{
    public static void main(String A[])
    {
        String Arr ;
        Scanner sobj = new Scanner(System.in);
        Boolean bRet = false;

        StringXX sxobj = new StringXX();

        System.out.println("Enter String : ");
        Arr = sobj.nextLine();

        bRet = sxobj.CheckAplha(Arr);

        if(bRet == true)
        {
            System.out.println("It is alphbet");
        }
        else
        {
            System.out.println("It is not an alphabe");
        }
    }
}

class StringXX
{
    public Boolean CheckAplha(String Brr)
    {
        for(int i = 0; i < Brr.length();i++)
        {
            if(Brr.charAt(i) >= 'a' && Brr.charAt(i) <= 'z')
            {
                return true;
            }
        }
        return false;
    }
}