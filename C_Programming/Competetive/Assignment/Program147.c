#include<stdio.h>

int CountCapital(char *str)
{
    int iCount = 0;

    if(*str < 'A' && *str > 'Z' && *str < 'a' && *str > 'z')
    {
        printf("Invalid Input");
        return -1;
    }

    while(*str != '\0')
    {
        if(*str >= 'a' && *str <= 'z')
        {
            iCount++;
        }
        str++;
    }

    return iCount;
}

int main()
{
    char Arr[20];
    int iRet = 0;

    printf("Enter string : \n");
    scanf("%[^'\n']s",Arr);

    iRet = CountCapital(Arr);

    printf("%d",iRet);

    return 0;
}