#include<stdio.h>

double SquareMeter(int iNo)
{
    double iSquareM = 0.0;

    iSquareM = iNo * 0.0929;
    
    return iSquareM;
}

int main()
{
    int iValue = 0;
    double iRet = 0;

    printf("Enter area in square feet\n");
    scanf("%d",&iValue);

    iRet = SquareMeter(iValue);

    printf("Area in square feet to square meter %lf\n",iRet);

    return 0;
}
