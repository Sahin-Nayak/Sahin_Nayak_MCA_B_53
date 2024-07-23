#include<stdio.h>

void main()
{
	int d,d1,last,first,n,c=0;
	
	printf("Enter the no : ");
	scanf("%d",&n);
	last = n%10;
	d=n;
	d1=n;
	while(d1>0)
	{
		c++;
		d1=d1/10;
	}
	printf("\nno of digit : %d",c);
	while(d>=10)
	{
		d=d/10;
	}
	first=d;
	printf("\n1st %d and last %d",first,last);
}
