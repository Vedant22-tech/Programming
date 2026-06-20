#include<stdio.h>

double FhtoCs(float iFar)
{
    double iCelsi = 0.0;

    iCelsi = (iFar -32) * (5.0/9.0); 

    return iCelsi;
}

int main()
{
    float fValue = 0.0f;
    double dRet = 0.0;

    printf("Enter temperature in Fahrenheit\n");
    scanf("%f",&fValue);

    dRet = FhtoCs(fValue);

    printf("Temperature in Celsius %lf\n",dRet);

    return 0;
}
