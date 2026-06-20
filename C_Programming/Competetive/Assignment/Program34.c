#include<stdio.h>

int EvenFactorial(int iNo)
{
    int i = 0;
    int iEvenFact = 1;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(i = 1; i <= iNo; i++)
    {
        if(i % 2 != 0)
        {
            iEvenFact = iEvenFact * i;
        }   
    }
    return iEvenFact;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number\n");
    scanf("%d",&iValue);

    iRet = EvenFactorial(iValue);

    printf("Even Factorial of number is %d\n",iRet);

    return 0;
}


// Time Complexity : O(N)