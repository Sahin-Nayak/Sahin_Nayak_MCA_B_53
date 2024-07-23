#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#define max 10
int stack[max],top=-1;

void push()
{
	int val;
	
	if(top==max-1)
	{
		printf("stack is full");
	}
	else{
		printf("Enter The value : ");
		scanf("%d",&val);	
		top++;
		stack[top]=val;
		printf("%d is pussed in stack successfully",val);
	}	
}
void pop()
{
	int val;
	
	if(top==-1)
	{
		printf("stack is empty");
	}
	else{
		top--;
		printf("popped successfully");
	}	
}
void display()
{
	int i;
	
	if(top==-1)
	{
		printf("stack is empty");
	}
	else{
		printf("stack value is : \n");
		for(i=top;i>=0;i--)
		{
			printf("|    ");
			printf("%d",stack[i]);
			printf("    |    \n");
			printf("-------\n");
		}
	}	
}


void main()
{
	while(1)
	{
		int ch;
		printf("\n\n1.PUSH\n2.POP\n3.DISPLAY\n4.EXIT\n");
		printf("Enter your choice :");
		scanf("%d",&ch);	
		switch(ch)
		{
			case 1 : push();
					 break;
			case 2 : pop();
					 break;
			case 3 : display();
					 break;
			case 4 : exit(1);
			default: printf("\nYou Entered Wrong Choice !!!!!! Please Enter A Correct Choice");
		}
	}	
}
