//pointer useeeeeeeee

#include<stdio.h>
#include<conio.h>

void main()
{
	int *p,*swap;
	printf("Enter the 1st number : ");
	scanf("%d",&*p);
	
	printf("Enter the 2nd number : ");
	scanf("%d",&*(p+1));
	
	*swap = p;
	*p=*(p+1);
	*(p+1)=*swap;
	
	printf("\n%d %d",*p,*(p+1));
}
