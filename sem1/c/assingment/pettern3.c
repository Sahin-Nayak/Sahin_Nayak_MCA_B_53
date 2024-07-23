#include <stdio.h>

int main()
{
	int i,j,n,k;
	printf("Enter the number of terms: ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		for(k=n-i;k>0;k--)
		{
			printf(" ");	
		}
		for(j=1;j<=i;j++)
		{
			if(j%2==0){
				printf("1");
			}
			else{
				printf("0");
			}
		}
		printf("\n");
	}
	return 0;
}