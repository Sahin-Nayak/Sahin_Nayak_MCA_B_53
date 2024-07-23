// factorial     5!=5*4*3*2*1

#include<stdio.h>
#include<conio.h>

int fact(n) //function defination
{
	int i,fact_ans=1;
	
	for(i=n;i>0;i--)
	{
		fact_ans*=i;
	}
	return fact_ans;
}

void main(){
	
	int n;
	printf("Enter The No : ");
	scanf("%d",&n);
	
	printf("The factorial of %d is %d ",n,fact(n)); // function calling
	
}
