//bubble sort

#include<stdio.h>
#include<conio.h>

void bubble(int array[],int n)
{
	int i,j;
	
	for(i=0;i<n-1;i++)
	{
		for(j=0;j<n-i-1;j++)
		{
			if(array[j]>array[j+1])
			{
				int swap = array[j];
				array[j]=array[j+1];
				array[j+1]=swap;
			}
		}
	}
	
	printf("\nThe sorted array is :\n");
	for(i=0;i<n;i++)
	{
		printf("%d    ",array[i]);
	}
}


void main()
{
	int n,i;
	
	printf("Enter the nno of terms :");
	scanf("%d",&n);
	int array[n];
	printf("Enter the value of the array : ");
	for (i=0;i<n;i++)
	{
		scanf("%d",&array[i]);
	}
	printf("The inputed array is :");
	for (i=0;i<n;i++)
	{
		printf("%d   ",array[i]);
	}
	
	bubble(array,n);
	
}
