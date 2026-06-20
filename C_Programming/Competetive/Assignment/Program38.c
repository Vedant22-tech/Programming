#include<stdio.h>

int KmToMeter(int iNo)
{
    int i = 1000;
    int iKmtoMeter = 0;

    iKmtoMeter = iNo * i;
    
    return iKmtoMeter;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter distance\n");
    scanf("%d",&iValue);

    iRet = KmToMeter(iValue);

    printf("Km distance to meter is %d\n",iRet);

    return 0;
}
