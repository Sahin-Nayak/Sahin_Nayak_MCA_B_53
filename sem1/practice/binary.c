//binary search

#include<stdio.h>
#include<conio.h>
void main()
{
	int n,i,search,start,middle,end;
	
	printf("Enter the number of terms :");
	scanf("%d",&n);
	
	int array[n];
	printf("Enter The Value Of The Array: \n");
	for(i=0;i<n;i++)
	{
		scanf("%d",&array[i]);
	}
	
	printf("\nEntered Array Is : \n");
	for(i=0;i<n;i++)
	{
		printf("%d",array[i]);
	}
	
	printf("Enter the value to be searched : ");
	scanf("%d",&search);
	
	start=0;
	end = n;
	middle = ((start+end)/2);
	
	while(start<=end)
	{
		if(array[middle]==search)
		{
			printf("The number %d is found",search);
			break;
		}
		else if(array[middle]<search)
		{
			start=middle+1;
			break;
		}
		else if
		{
			end=middle-1;
		}
	}
	
}

