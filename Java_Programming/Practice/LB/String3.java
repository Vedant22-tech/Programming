import java.util.Scanner;

class String3
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        String str = new String();

        System.out.println("Enter the String");
        str = sobj.nextLine();

        int iRet = 0;
        String sRet = null;
        boolean bRet = false;

        StringXXX sxobj = new StringXXX();

        while(true)
        {
            System.out.println("------------------------------------------------------------");
            System.out.println("1 : Length of string");
            System.out.println("2 : Length of Capital string");
            System.out.println("3 : Length of small string");
            System.out.println("4 : Capital to Small Character in string");
            System.out.println("5 : Small to Capital Character in string");
            System.out.println("6 : Length of vowels in string");
            System.out.println("7 : Capital To Small and Small to Capital in String"); 
            System.out.println("8 : Reversed string");
            System.out.println("9 : Check palindrome");
            System.out.println("------------------------------------------------------------");

            System.out.println("Enter your choice");
            int Choice = sobj.nextInt();

            switch (Choice) 
            {
                case 1:
                iRet = sxobj.Count(str);
                System.out.println("Length of string : "+iRet);  
                break;

                case 2:
                iRet = sxobj.CountCap(str);
                System.out.println("Length of Capital string : "+iRet); 
                break;

                case 3:
                iRet = sxobj.CountSmall(str);
                System.out.println("Length of small string : "+iRet); 
                break;

                case 4:
                sRet = sxobj.CapToSmall(str);
                System.out.println("Capital to Small Character in string : "+sRet); 
                break;

                case 5:
                sRet = sxobj.SmallToCap(str);
                System.out.println("Small to Capital Character in string : "+sRet);
                break;

                case 6:
                iRet = sxobj.CountVowel(str);
                System.out.println("Length of vowels in string : "+iRet); 
                break;

                case 7:
                sRet = sxobj.CapToSmallAndSmallToCap(str);
                System.out.println("Capital To Small and Small to Capital in String: "+sRet);  
                break;

                case 8:
                sRet = sxobj.StringRev(str);
                System.out.println("Reversed string : "+sRet);  
                break;

                case 9:
                bRet = sxobj.PalindromeX(str);
                if(bRet == true)
                {
                    System.out.println("It is Palindrome");
                }
                else
                {
                    System.out.println("It is not an palindrome");
                }
                break;

                case 10:
                System.out.println("10 : Exit");    
                sobj.close();
                return;
            
                default:
                    System.out.println("Invalid choice");
                    break;
            
            }

        }

    }
}

class StringXXX
{
    public int Count(String Brr)
    {
        int i = 0;
        int iCount = 0;

        for(i = 0; i < Brr.length(); i++)
        {
            iCount++;
        }
        return iCount;
    }  
    
    public int CountCap(String Brr)
    {
        int i = 0;
        int iCount = 0;

        for(i = 0; i < Brr.length(); i++)
        {
            if(Brr.charAt(i) >= 'A' && Brr.charAt(i) <= 'Z')
            {
                iCount++;
            }
        }
        return iCount;
    } 

    public int CountSmall(String Brr)
    {
        int i = 0;
        int iCount = 0;

        for(i = 0; i < Brr.length(); i++)
        {
            if(Brr.charAt(i) >= 'a' && Brr.charAt(i) <= 'z')
            {
                iCount++;
            }
        }
        return iCount;
    }

    public String CapToSmall(String Brr)
    {
        int i = 0;
        String Crr = null;
        char ch[] = Brr.toCharArray();

        for(i = 0; i < ch.length; i++)
        {
            if(ch[i] >= 'A' && ch[i] <= 'Z')
            {
                ch[i] = (char)(ch[i] + 32);
            }
        }
        Crr = new String(ch);
        return Crr;
    }

    public String SmallToCap(String Brr)
    {
        int i = 0;
        String Crr = null;
        char ch[] = Brr.toCharArray();

        for(i = 0; i < ch.length; i++)
        {
            if(ch[i] >= 'a' && ch[i] <= 'z')
            {
                ch[i] = (char)(ch[i] - 32);
            }
        }
        Crr = new String(ch);
        return Crr;
    }

    public int CountVowel(String Brr)
    {
        int i = 0;
        int iCount = 0;

        for(i = 0; i < Brr.length(); i++)
        {
            if(Brr.charAt(i) == 'a' || Brr.charAt(i) == 'e' || Brr.charAt(i) == 'i' || Brr.charAt(i) == 'o' || Brr.charAt(i) == 'u' ||
            Brr.charAt(i) == 'A' || Brr.charAt(i) == 'E' || Brr.charAt(i) == 'I' || Brr.charAt(i) == 'O' || Brr.charAt(i) == 'U')
            {
                iCount++;
            }
        }
        return iCount;
    } 

    public String CapToSmallAndSmallToCap(String Brr)
    {
        int i = 0;
        String Crr = null;
        char ch[] = Brr.toCharArray();

        for(i = 0; i < ch.length; i++)
        {
            if((ch[i] >= 'A' && ch[i] <= 'Z'))
            {
                ch[i] = (char)(ch[i] + 32);
            }
            else if((ch[i] >= 'a' && ch[i] <= 'z'))
            {
                ch[i] = (char)(ch[i] - 32);
            }
        }
        Crr = new String(ch);
        return Crr;
    }

    public String StringRev(String Brr)
    {
        int i = 0;
        String Crr = null;
        char ch[] = Brr.toCharArray();
        char temp = '\0';

        int start = 0;
        int end = ch.length - 1;

        while(start < end)
        {
            temp = ch[start];  
            ch[start] = ch[end];
            ch[end] = temp; 

            start++;
            end--;
        }

        Crr = new String(ch);
        return Crr;
    }

    public boolean PalindromeX(String Brr)
    {
        int i = 0;
        String Crr = null;
        char ch[] = Brr.toCharArray();
        char temp = '\0';
        boolean bFlag = false;

        int start = 0;
        int end = ch.length - 1;

        while(start < end)
        {
            temp = ch[start];  
            ch[start] = ch[end];
            ch[end] = temp; 

            start++;
            end--;
        }

        Crr = new String(ch);
        
        if(Brr.equals(Crr))
        {
            bFlag = true;
        }
        return bFlag;
    }
}