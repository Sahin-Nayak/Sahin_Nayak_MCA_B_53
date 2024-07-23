// sum of all elemenrts in array using pointer

#include<stdio.h>
#include<malloc.h>

void main()
{
	int i,n,a[100],b[100],*ptr=a,*p;
	printf("Eneter the no of terms: ");
	scanf("%d",&n);
	printf("Enter the values: ");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
		
	}
	ptr=a;
	printf("entered value is:");
	for(i=0;i<n;i++)
	{
		printf("%d\n",*ptr);
		ptr++;
	}
	ptr=a;
//	printf("entered value %d",*ptr+1);
	for(i=0;i<n;i++)
	{
		b[i]= *ptr;
		ptr++;
	}
	p=b;
	for(i=0;i<n;i++)
	{
		printf("%d\n",*p);
		p++;
	}
}
