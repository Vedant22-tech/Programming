#include<stdio.h>

int RangeSumEven(int iStart, int iEnd)
{   
    int iCnt = 0;
    int iSumEven = 0;

    if(iStart > iEnd || iStart < 0)
    {
        printf("Invalid Range\n");
        return -1;
    }

    for(iCnt = iStart; iCnt <= iEnd; iCnt++)
    {
        if(iCnt % 2 == 0)
        {
            iSumEven = iSumEven + iCnt;
        } 
    }
    return iSumEven;
}

int main()
{
    int iValue1 = 0;
    int iValue2 = 0;
    int iRet = 0;

    printf("Enter Starting point : \n");
    scanf("%d",&iValue1);

    printf("Enter Ending point : \n");
    scanf("%d",&iValue2);

    iRet = RangeSumEven(iValue1, iValue2);

    printf("%d",iRet);

    return 0;
}