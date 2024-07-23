//pointer

#include<stdio.h>
void main()
{
	int n,*p,sum=0,i;
	printf("Enter the number of terms : ");
	scanf("%d",&n);
	
	int a[n];
	printf("\nEnter the value of the array : \n");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	
	p=&a[0];
	
	for(i=0;i<n;i++)
	{
		sum=sum+*p;
		p++;
	}
	
	printf("the sum is : %d",sum);
	
	
}
