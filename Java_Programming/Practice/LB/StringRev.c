#include<stdio.h>

void StringRev(char Brr[])
{
    char *start = NULL;
    char *end = NULL;
    char temp = {'\0'};

    start = Brr;
    end = Brr;

    while(*end != '\0')
    {
        end++;
    }
    end--;

    while(start < end)
    {
        temp = *start;
        *start = *end;
        *end = temp;

        start++;
        end--;
    }

}

int main()
{
    char Arr[50] = {'H','e','l','l','o','\0'};

    StringRev(Arr);

    printf("Reversed String is : %s",Arr);

    return 0;
}