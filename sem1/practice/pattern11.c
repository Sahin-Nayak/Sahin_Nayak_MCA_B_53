//pettern printing

#include<stdio.h>

void main()
{
	int i,j,n,k;
	printf("Enter the line no : ");
	scanf("%d",&n);
	
	for(i=1;i<n;i++)
	{
		for(k=i;k<n;k++)
		{
			printf(" ");
		}
		for(j=1;j<=(2*i-1);j++)
		{
			printf("%d",j);
		}
		printf("\n");
	}
}
