#include <stdio.h>

int main()
{
	int i,j,n;
	printf("Enter the number of terms: ");
	scanf("%d",&n);
	for(i=n;i>0;i--)
	{
		for(j=i;j>0;j--)
		{
			printf("*");
		}
		printf("\n");
	}
	return 0;
}