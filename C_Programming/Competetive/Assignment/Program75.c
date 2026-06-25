#include<stdio.h>
#include<stdlib.h>

void DigitsSum(int Arr[], int iLength)
{   
    int iCnt = 0;
    int iDigit = 0;
    int iDigitSum = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        iDigitSum = 0;
        while(Arr[iCnt] != 0)
        {
            iDigit = Arr[iCnt] % 10;
            iDigitSum = iDigitSum + iDigit;
            Arr[iCnt] = Arr[iCnt] / 10 ;  
        }
        printf("%d\t",iDigitSum); 
    }
    
}

int main()
{
    int iSize = 0, iCnt = 0;
    int *p = NULL;

    printf("Enter the number of elements :\n");
    scanf("%d",&iSize);

    p = (int*) malloc (sizeof(int) * iSize);

    if(p == NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }

    printf("Enter the elements : \n");

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        scanf("%d",&p[iCnt]);
    }

    DigitsSum(p, iSize);

    free(p);

    return 0;
}