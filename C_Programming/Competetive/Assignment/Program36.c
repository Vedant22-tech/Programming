#include<stdio.h>

double CircleArea(float fRadius)
{
    float fPI = 3.14f;
    double dArea = 0.0;

    dArea = fPI * fRadius * fRadius;

    return dArea;
}

int main()
{
    float fValue = 0.0f;
    double dRet = 0.0;

    printf("Enter Radius\n");
    scanf("%f",&fValue);

    dRet = CircleArea(fValue);

    printf("Area of Circle is %lf\n",dRet);

    return 0;
}
