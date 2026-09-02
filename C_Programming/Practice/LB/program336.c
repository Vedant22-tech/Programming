#include<stdio.h>

typedef unsigned int UINT;

// Position : 4
UINT OFFBit(UINT iNo, UINT iPos)
{
    UINT iMask = 0xFFFFFFF7;
    UINT iResult = 0;

    if(iPos < 1 || iPos > 32)
    {
        printf("Invalid bit position\n");
        return iNo;
    }

}

int main()
{
    UINT iValue = 0, iRet = 0, iLocation = 0;   

    printf("Enter number : \n");
    scanf("%d",&iValue);

    printf("Enter the bit position : \n");
    scanf("%d",&iLocation);

    iRet = OFFBit(iValue, iLocation);

    printf("Updated number is : %d\n",iRet);

    return 0;
}