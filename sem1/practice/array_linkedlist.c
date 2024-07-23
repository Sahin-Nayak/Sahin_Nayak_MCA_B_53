#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
typedef struct stack
{
	int data;
	struct node *next;	
};
struct stack *head=NULL;

void push()
{
	struct stack *p;
	p=(struct stack*)malloc(sizeof(struct stack));
	printf("Enter the value :");
	scanf("%d",&p->data);
	if(head==NULL)
	{
		head=p;
		head->next=NULL;
	}
	else
	{
		p->next=head;
		head=p;
	}
}
void display()
{
	struct stack *p;
	if(head==NULL)
	{
		printf("stack is empty");
	}
	else
	{
		p=head;
		printf("NULL");
		while(p!=NULL)
		{
			printf("<--%d",p->data);
			p=p->next;
		}
	}
}
void pop()
{
	struct stack *p;
	if(head==NULL)
	{
		printf("stack is empty");
	}
	else
	{
		p=head;
		head=p->next;
	}
}

int main(){
	
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
