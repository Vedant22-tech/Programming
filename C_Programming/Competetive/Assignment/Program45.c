#include<stdio.h>

int CountDiff(int iNo)
{
    int iDigits = 0;
    int iCnt = 0;
    int iSumEven = 0;
    int iSumOdd = 0;
    int iDiff = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    while(iNo != 0)
    {
        iDigits = iNo % 10 ;

        if(iDigits % 2 == 0)
        {
            iSumEven = iSumEven + iDigits;
        }
        else
        {
            iSumOdd = iSumOdd + iDigits;
        }
        
        iNo = iNo /10;
    }

    iDiff = iSumEven - iSumOdd;

    return iDiff;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter the number : \n");
    scanf("%d",&iValue);

    iRet = CountDiff(iValue);

    printf("%d\n",iRet);

    return 0;
}