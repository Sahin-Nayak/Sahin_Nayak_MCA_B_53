// armstrong    153 = 1^3 + 5^3 + 3^3 = 153

#include<stdio.h>
#include<conio.h>
void main()
{
	int n,c=0,r,sum=0,mul,temp,temp1;
	
	printf("Enter the no. to be checked : ");
	scanf("%d",&n);
	temp=n;
	while(temp!=0)
	{
		temp=temp/10;
		c++;
	}
	temp=n;
	while(temp>0)
	{
		r=temp%10;
		temp1=c;
		mul=1;
		while(temp1>0)
		{
			mul=mul*r;
			temp1--;
		}
		sum=sum+mul;
		temp=temp/10;
	}

	if(n==sum)
	{
		printf("armstrong");
	}
	else{
		printf("not");
	}
}
