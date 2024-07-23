#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

typedef struct node
{
	int data;
	struct node *next, *prev;	
		
};
struct node *head=NULL;

void insbeg()
{
	struct node *p;
	p=(struct node*)malloc(sizeof(struct node));
	printf("Enter the data : ");
	scanf("%d",&p->data);
	if(head==NULL)
	{
		head=p;
		head->next=NULL;
		head->prev=NULL;
	}
	else
	{
		p->next=head;
		p->prev=NULL;
		head->prev=p;
		head=p;
	}
}
void display()
{
	struct node *p;
	
	if(head==NULL)
	{
		printf("the linked list is empty");
	}
	else
	{
		p=head;
		printf("NULL");
		while(p!=NULL)
		{
			printf("<--%d-->",p->data);
			p=p->next;	
		}
		printf("NULL");	
	}
}

int main()
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
//			case 2 : del();
//					 break;
			case 3 : display();
					 break;
			case 4 : exit(1);
			default : printf("Your choice is wrong");
		}
	}
	
}
