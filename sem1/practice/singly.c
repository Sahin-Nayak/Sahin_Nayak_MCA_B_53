#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
struct node
{
	int data;
	struct node *link;
};
struct node *head=NULL;
void ins();
void display();
void insend();
void insafteranypos();
void insbeforeanypos();
void insafteranynode();
void insbeforeanynode();
void count();
void reverse();
void delbeg();
void delend();
void delanypos();
int search();
void distance();

void ins()
{
	struct node *p;
	p=(struct node*)malloc(sizeof(struct node));
	printf("Enter the number : ");
	scanf("%d",&p->data);
	if(head==NULL)
	{
		head=p;
		head->link=NULL;
	}
	else
	{
		p->link=head;
		head=p;
	}
}
void display()
{
	struct node *p;
	if(head==NULL)
	{
		printf("Linked list is empty");
	}
	else
	{
		p=head;
		while(p!=NULL)
		{
			printf("%d-->",p->data);
			p=p->link;
		}
		printf("NULL");
	}
}
void insend()
{
	struct node *p,*q;
	p=(struct node*)malloc(sizeof(struct node));
	printf("Enter the number : ");
	scanf("%d",&p->data);
	if(head==NULL){
		head=p;
		head->link=NULL;
	}
	else
	{
		q=head;
		while(q->link!=NULL)
		{
			q=q->link;
		}
		q->link=p;
		p->link=NULL;
	}
}
void insafteranypos()
{
	struct node *p,*q;
	int pos,c=0;
	p=(struct node*)malloc(sizeof(struct node));
	printf("Enter the number : ");
	scanf("%d",&p->data);
	printf("Enter the pos : ");
	scanf("%d",&pos);
		q=head;
		while(c!=pos && q->link!=NULL){
			c++;
			q=q->link;
		}
		if(c==pos && q->link==NULL)
		{
			
		}
	}
}
int main()
{
	while(1)
	{
		int ch;
		printf("\n1:Insert\n2:Insert at the end\n3:Insert after any position\n");
		printf("\n4:Insert after any node\n5:Insert before any node\n6:Insert before any position\n");
		printf("\n7:Count the total number of nodes\n8:Delete from the beginning\n9:Delete at the end\n");
		printf("\n10:Delete from any position\n11:Reverse the list\n12:Display the linked list\n");
		printf("\n13:Search a particular number\n14:Distance between two nodes \n15.Exit\n");
		
		printf("Enter the choice : ");
		scanf("%d",&ch);
		
		switch(ch)
		{
			case 1:ins();
				break;
			case 2:insend();
//				break;
//			case 3:insafteranypos();
//				break;
//			case 4:insafteranynode();
//				break;	
//			case 5:insbeforeanynode();
//				break;
//			case 6: insbeforeanypos();
//				break;
//			case 7:count();	
//				break;	
//			case 8:delbeg();
//				break;	
//			case 9:delend();
//				break;
//			case 10: delanypos();
//				break;
//			case 11:reverse();
				break;
			case 12:display();
				break;	
//			case 13: search();
//			case 14:distance();
//					break;
			case 15:exit(0);
			default:printf("\nWrong choice..");	
		}
	}
}
