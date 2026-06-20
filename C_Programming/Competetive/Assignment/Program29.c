#include<stdio.h>

void Table(int iNo)
{
    int i = 0;
    int iTab = 1;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(i = 1; i <= 10; i++)
    {
        iTab = iNo * i;
        printf("%d\t",iTab);
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number\n");
    scanf("%d",&iValue);

    Table(iValue);

    return 0;
}

// Time Complexity : O(N)