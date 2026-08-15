#include<stdio.h>

char *StringRev(char Crr[], char Drr[])
{
    int start = 0;
    int end = 0;

    while(Crr[end] != '\0')
    {
        end++;
    }
    end--;

    while(end >= 0)
    {
        Drr[start] = Crr[end];
        end--;
        start++;
    }
    Drr[start] = '\0';

    return Drr;

}

int main()
{
    char Arr[50] = {'H','e','l','l','o','\0'};
    char Brr[50] = {'\0'};

    char *Ret = NULL;

    Ret = StringRev(Arr, Brr);

    printf("Entered String is : %s\n",Arr);
    printf("Reversed String is : %s\n",Ret);

    return 0;
}