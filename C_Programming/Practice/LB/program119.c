// ERROR due to stdlib.h
#include<stdio.h>

int main()
{
    int *Brr = NULL;
    int iLength = 0, iCnt = 0;

    // step 1: Accept the number of elements
    printf("Enter the number of elements :\n");
    scanf("%d",&iLength);

    // step 2: Allocate the memory
    Brr = (int *)malloc(iLength * sizeof(int));

    // step 3: Accept the values from the user
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&Brr[iCnt]);
    }

    // step 4: Use the memory  (LOGIC)

    // step 5: Re-allocate the memory
    free(Brr);

    return 0;
}