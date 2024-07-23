#include<stdio.h>
#include<conio.h>
void main()
{
	int n;
	printf("enter the size of the array : ");
	scanf("%d",&n);
	int a[n];
	printf("Enter the value of the array : ");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("\n the inputed array is : \n");
	for(i=0;i<n;i++)
	{
		printf("%d    ",a[i]);
	}
	printf("enter the no to be search : ");
	scanf("%d",&search);
	
}
