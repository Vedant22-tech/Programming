#include<stdio.h>

int Difference(char *str)
{
    int iCountCap = 0;
    int iCountSmall = 0;
    int iDifference = 0;


    if(*str < 'A' && *str > 'Z' && *str < 'a' && *str > 'z')
    {
        printf("Invalid Input");
        return -1;
    }

    while(*str != '\0')
    {
        if(*str >= 'a' && *str <= 'z')
        {
            iCountSmall++;
        }
        else if(*str >= 'A' && *str <= 'Z')
        {
            iCountCap++;
        }
        str++;
    }
    iDifference = iCountSmall - iCountCap;

    return iDifference;
}

int main()
{
    char Arr[20];
    int iRet = 0;

    printf("Enter string : \n");
    scanf("%[^'\n']s",Arr);

    iRet = Difference(Arr);

    printf("%d",iRet);

    return 0;
}