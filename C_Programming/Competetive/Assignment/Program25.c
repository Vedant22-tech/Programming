#include<stdio.h>

void MultipleDisplay(int iNo)
{
    int i = 0;
    int iMul = 0;

    for(i = 1; i <= 5; i++)
    {
       iMul = iNo * i;
       printf("%d\t",iMul); 
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number\n");
    scanf("%d",&iValue);

    MultipleDisplay(iValue);

    return 0;
}