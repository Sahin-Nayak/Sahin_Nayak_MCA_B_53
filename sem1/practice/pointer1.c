#include<stdio.h>

int sum(*a,)

void main()
{
	int n;
	
	printf("Enter the size of array : ");
	scanf("%d",&n);
	
	int a[n];
	printf("\nEnter the value of array :\n");
	for(i=0;i<n;i++)
	{
		scanf("%d",a[i]);
	}
	int s=sum(&a[0]);
}
