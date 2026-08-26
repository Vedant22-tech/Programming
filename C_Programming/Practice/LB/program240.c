#include<stdio.h>

int main()
{
    char Arr[50] = {'\0'};

    printf("Enter String : \n");
    scanf("%s",Arr);    // ISSUE can't give output after space

    printf("Entered String is : %s\n",Arr);

    return 0;
}