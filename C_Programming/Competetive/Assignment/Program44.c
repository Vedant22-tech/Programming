#include<stdio.h>

int MultiDigits(int iNo)
{
    int iDigits = 0;
    int iCnt = 0;
    int iMul = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    iMul = 1;

    while(iNo != 0)
    {
        iDigits = iNo % 10 ;

        if(iDigits != 0)
        {
            iMul = iMul * iDigits;
        }
        
        iNo = iNo /10;
    }

    return iMul;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter the number : \n");
    scanf("%d",&iValue);

    iRet = MultiDigits(iValue);

    printf("%d\n",iRet);

    return 0;
}