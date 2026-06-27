#include<stdio.h>

int DollarToINR(int iNo)
{
    int i = 0;
    int iINR = 1;

    for(i = 1; i <= iNo; i++)
    {
        iINR = i * 70;
    }
    return iINR;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number\n");
    scanf("%d",&iValue);

    iRet = DollarToINR(iValue);

    printf("Value in INR is %d\n",iRet);

    return 0;
}


// Time Complexity : O(N)