#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

typedef struct node{
	int data;
	struct node *next;
};
struct node *head=NULL;

void insbeg()
{
	struct node *p;
	
	p=(struct node*)malloc(sizeof(struct node));
	printf("enter the value : ");
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
	struct node *p;
	if(head==NULL)
	{
		printf("The linked list is empty");
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
void del()
{
	struct node *p,*q;
	if(head==NULL)
	{
		printf("No data available");
	}
	else
	{
		p=head;
		while(p->next!=NULL)
		{
			q=p;
			p=p->next;
		}
		q->next=NULL;
	}
}

void main()
{
	int ch;
	
	while(1)
	{
		printf("1.insert beg\n2.delete\n3.display");
		printf("Enter your choice :: ");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1 : insbeg();
					 break;
			case 2 : del();
					 break;
			case 3 : display();
					 break;
			case 4 : exit(1);
			default : printf("Your choice is wrong");
		}
	}
	
}
