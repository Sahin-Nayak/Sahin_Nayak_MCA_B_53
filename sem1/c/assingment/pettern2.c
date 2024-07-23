#include <stdio.h>

int main()
{
	int i,j,k,n;
	printf("Enter the number of terms: ");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		for(k=n-i;k>0;k--)
		{
			printf(" ");	
		}
		for(j=0;j<=i;j++)
		{
			printf("*");
			printf(" ");
		}
		printf("\n");
	}
	return 0;
}