#include<stdio.h>

void StringRev(char Brr[])
{
    char *start = NULL;
    char *end = NULL;
    char *temp = NULL;
    char swap = '\0';

    start = Brr;
    end = Brr;
    
    while(*start !='\0')
    {
        temp = start;
        while(*end != ' ' && *end != '\0')
        {
            end++;
        }
        end--;

        while(start < end)
        {
            swap = *start;
            *start = *end;
            *end = swap;

            start++;
            end--;
        }

        while(*temp != ' ' && *temp !='\0')
        {
            temp++;
        }

        while(*temp == ' ')
        {
            temp++;
        }

        start = temp;
        end = temp;
    }  
}

int main()
{
    char Arr[50] ;

    printf("Enter the string : \n");
    scanf("%[^\n]s",Arr);

    StringRev(Arr);

    printf("Reversed String is : %s",Arr);

    return 0;
}