#include<stdio.h>

void selection_sort(int a[], int n)
{
	int i,j;
	for(i=0;i<n-1;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(a[j]<a[i])
			{
				int swap=a[i];
				a[i]=a[j];
				a[j]=swap;
			}
		}
	}
	printf("\nthe sorted array is :\n");
	for(i=0;i<n;i++)
	{
		printf("%d         ",a[i]);
	}
}

void main()
{
	int n,i;
	printf("Enter the max size of array : ");
	scanf("%d",&n);
	int a[n];
	printf("Enter the array value : ");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	selection_sort(a,n);
}
