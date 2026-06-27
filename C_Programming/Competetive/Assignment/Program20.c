#include<stdio.h>

int FactDiff(int iNo)
{
    int i = 0;
    int iSum1 = 0;
    int iSum2 = 0;
    int iDiff = 0;

    for(i = 1; i <= iNo/2; i++)
    {
        if(iNo % i == 0)
        {
            iSum1 = iSum1 + i; 
        }
    }

    for(i = 1; i <= iNo; i++)
    {
        if(iNo % i != 0)
        {
            iSum2 = iSum2 + i; 
        }
    }

    iDiff = iSum1 - iSum2;

    return iDiff;
}

int main()
{
    int iValue = 0;
    int iRet = 0; 

    printf("Enter number\n");
    scanf("%d",&iValue);

    iRet = FactDiff(iValue);

    printf("%d",iRet);

    return 0;
}