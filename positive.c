#include <stdio.h>
 
int main()
{
    int a;
     
  
    printf("Enter any number: ");
    scanf("%d", &a);
     
 
    if(a > 0)
    {
        printf("Number is POSITIVE");
    }
    else if(a < 0)
    {
        printf("Number is NEGATIVE");
    }
    else
    {
        printf("Number is ZERO");
    }
 
    return 0;
} 
