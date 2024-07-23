#include <stdio.h>

int main()
{
	int num;
	printf("Enter the number to be checked : ");
	scanf("%d",&num);
	if(num>0)
	{
		printf("the number is positive");
	}
	else if(num<0)
	{
		printf("the number is negetive");
	}
	else{
		printf("the number is 0");
	}
}