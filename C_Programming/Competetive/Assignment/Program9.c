#include<stdio.h>

int Display(int iNo, int Frequency)
{
    int iCnt = 0;

    for(iCnt = 1; iCnt <= Frequency; iCnt++)
    {
        printf("%d\t",iNo);
    }
}

int main()
{
    int iValue = 0;
    int iCount = 0;

    printf("Enter number : \t");
    scanf("%d",&iValue);

    printf("Enter Frequency : ");
    scanf("%d",&iCount);

    Display(iValue,iCount);

    return 0;
}