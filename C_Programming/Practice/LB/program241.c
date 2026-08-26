#include<stdio.h>

int main()
{
    char Arr[50] = {'\0'};

    printf("Enter String : \n");
    scanf("%[^'\n']s",Arr);     // [^'\n'] regex (Regular Expression ,until there is enter it will take input)

    printf("Entered String is : %s\n",Arr);

    return 0;
}