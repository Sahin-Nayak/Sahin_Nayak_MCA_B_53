//prime no

#include<stdio.h>
#include<conio.h>
void main()
{
	int lr,ur,i,j,flag;
	
	printf("Enter the lower range: ");
	scanf("%d",&lr);
	printf("Enter the upper range: ");
	scanf("%d",&ur);
	
	for(i=lr;i<ur;i++)
	{
		flag=0;
		for(j=lr;j<=i/2;++j)
		{
			if(i%j==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			printf("%d    ",i);
		}
	}
}
