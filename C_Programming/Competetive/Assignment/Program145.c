#include<stdio.h>

void Display(char ch)
{
    if(ch >= 0 && ch <= 127)
    {
        printf("Decimal : %d\nOctal : %o\nHexadecimal : %x\n",ch,ch,ch);
    }
    
}

int main()
{
    char cValue = '\0';

    printf("Enter the character\n");
    scanf("%c",&cValue);

    Display(cValue);

    return 0;
}