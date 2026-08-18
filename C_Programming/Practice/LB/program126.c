#include<stdio.h>
#include<stdlib.h>

int CountOdd(int Arr[], int iSize)
{
    int iCnt = 0;
    int iSum = 0;

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] % 2 != 0)
        {
            iSum = iSum + Arr[iCnt];
        } 
    }
    return iSum;
}

int main()
{
    int iLength = 0, iRet = 0, iCnt = 0;
    int *Brr = NULL;

    printf("Enter the number of elements :\n");
    scanf("%d",&iLength);

    Brr = (int*) malloc(iLength * sizeof(int));

    printf("Enter the elements : \n");

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&Brr[iCnt]);
    }

    iRet = CountOdd(Brr, iLength);

    printf("Count of odd elements is %d",iRet);

    free(Brr);

    return 0;
}