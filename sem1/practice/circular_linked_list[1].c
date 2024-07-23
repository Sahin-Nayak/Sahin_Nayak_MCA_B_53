//circular linked list
#include<stdio.h>
#include<stdlib.h>
struct node
{
	int data;
	struct node *next;
};
struct node *head=NULL;
void insbeg();
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
int search(int);
void display();
void distance();
int main()
{
	int ch,k,f=0;
	while(1)
	{
		printf("\n1:Insert in the beginning\n2:Insert at the end\n3:Insert after any position\n");
		printf("\n4:Insert after any node\n5:Insert before any node\n6:Insert before any position\n");
		printf("\n7:Count the total number of nodes\n8:Delete from the beginning\n9:Delete at the end\n");
		printf("\n10:Delete from any position\n11:Reverse the list\n12:Display the linked list\n");
		printf("\n13:Search a particular number\n14:Distance between two nodes \n15.Exit\n");
		printf("Enter your choice ");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:insbeg();
				break;
			case 2:insend();
				break;
			case 3:insafteranypos();
				break;
			case 4:insafteranynode();
				break;	
			case 5:insbeforeanynode();
				break;
			case 6: insbeforeanypos();
				break;
			case 7:count();	
				break;	
			case 8:delbeg();
				break;	
			case 9:delend();
				break;
			case 10: delanypos();
				break;
			case 11:reverse();
				break;
			case 12:display();
				break;	
			case 13:printf("Enter the search value ");
					scanf("%d",&k);
					f=search(k);
					if(f==1)
					printf("\n%d found ",k);
					else
					printf("\n%d not found",k);
				break;
			case 14:distance();
					break;
			case 15:exit(0);
			default:printf("\nWrong choice..");		
		}
	}
}
void insbeg()
{
	struct node *p,*q;
	p=(struct node*)malloc(sizeof(struct node));
	printf("\nEnter the data to be inserted ");
	scanf("%d",&p->data);
	if(head==NULL)
	{
		head=p;
		head->next=head;
	} 
	else
	{
		p->next=head;
		q=head;
		while(q->next!=head)
		{
			q=q->next;
		}
		q->next=p;
		head=p;
	}
}
void insend()
{
	struct node *p,*q;
	p=(struct node*)malloc(sizeof(struct node));
	printf("\nEnter the data to be inserted ");
	scanf("%d",&p->data);
	if(head==NULL)
	{
		head=p;
		head->next=head;
	} 
	else
	{
		q=head;
		while(q->next!=head)
		{
			q=q->next;
		}
		q->next=p;
		p->next=head;
	}
}
void insafteranypos()
{
	int i,pos;
	struct node *p,*q;
	p=(struct node*)malloc(sizeof(struct node));
	printf("\nEnter the data to be inserted ");
	scanf("%d",&p->data);
	if(head==NULL)
	{
		head=p;
		head->next=head;
	} 
	else
	{
		printf("\nEnter position ");
		scanf("%d",&pos);
		i=1;
		q=head;
		while(i!=pos&&q->next!=head)
		{
			i++;
			q=q->next;
		}
		if(i==pos&&q->next==head)
		{
			q->next=p;
			p->next=head;
		}
		else if(i==pos&&q->next!=head)
		{
			p->next=q->next;
			q->next=p;
		}
		else   //else if(i!=pos&&q->next==NULL)
		{
			printf("\nPosition do not exist");
		}
	}
}
void insbeforeanypos()
{
	struct node *p,*q;
	int i,pos;
	p=(struct node*)malloc(sizeof(struct node));
	printf("\nEnter the data to be inserted ");
	scanf("%d",&p->data);
	if(head==NULL)
	{
		head=p;
		head->next=head;
	} 
	else
	{
		printf("\nEnter position ");
		scanf("%d",&pos);
		i=1;
		q=head;
		while(i!=pos-1&&q->next!=head)
		{
			i++;
			q=q->next;
		}
		if (pos==1)
		{
			p->next=head;
			while(q->next!=head)
			{
				q=q->next;
			}
			q->next=p;
			head=p;
		}
		else if(i==pos-1&&q->next==head)
		{
			q->next=p;
			p->next=head;
		}
		else if(i==pos-1&&q->next!=head)
		{
			p->next=q->next;
			q->next=p;
		}
		else   //else if(i!=pos&&q->next==NULL)
		{
			printf("\nPosition do not exist");
		}
	}
}
void insafteranynode()
{
	struct node *p,*q;
	int key;
	p=(struct node*)malloc(sizeof(struct node));
	printf("\nEnter the data to be inserted ");
	scanf("%d",&p->data);
	if(head==NULL)
	{
		head=p;
		head->next=head;
	} 
	else
	{
		printf("\nEnter searching value ");
		scanf("%d",&key);
		q=head;
		while(q->data!=key&&q->next!=head)
		{
			q=q->next;
		}
		if(q->data==key&&q->next==head)
		{
			q->next=p;
			p->next=head;
		}
		else if(q->data==key&&q->next!=head)
		{
			p->next=q->next;
			q->next=p;
		}
		else   //else if(i!=pos&&q->next==NULL)
		{
			printf("\nValue not found ");
		}
	}
}
void insbeforeanynode()
{
	struct node *p,*q,*t;
	int key;
	p=(struct node*)malloc(sizeof(struct node));
	printf("\nEnter the data to be inserted ");
	scanf("%d",&p->data);
	if(head==NULL)
	{
		head=p;
		head->next=head;
	} 
	else
	{
		printf("\nEnter the searching value ");
		scanf("%d",&key);
		q=head;
		while(q->data!=key&&q->next!=head)
		{
			t=q;
			q=q->next;
		}
		if(head->data==key)
		{
			p->next=head;
			while(q->next!=head)
			{
				q=q->next;
			}
			q->next=p;
			head=p;
		}
		else if(q->data==key)
		{
			p->next=q;
			t->next=p;
		}
		else   //else if(i!=pos&&q->next==NULL)
		{
			printf("\nValue not found ");
		}
	}
}
void count()
{
	struct node *p;
	int k=1;
	if(head==NULL)
	{
		printf("\nTotal node is 0");
	}
	else
	{
		p=head;
		while(p->next!=head)
		{	
			p=p->next;
			k++;
		}
		printf("\nTotal nodes is %d",k);
	}	
}
void reverse()
{
	struct node *p,*q,*r,*l;
	int i=1;
	p=head;
	if(head==NULL)
	{
		printf("\nEmpty List");
	}
	else
	{
		while(p->next!=head)
		{
			q=head;
			while(q->next!=head)
			{
				r=q;
				q=q->next;
			}
			if(i==1)
			{
				q->next=head;
				r->next=q;
				head=q;
				l=q;
			}
			else if(p->next!=head)
			{
				q->next=l->next;
				l->next=q;
				l=l->next;
				r->next=head;
			}
			i=i+1;
		}
	}
}
void delbeg()
{
	struct node *p,*q;
	if(head==NULL)
	{
		printf("\nEmpty List");
	}
	else
	{
		if(head->next==head)
		{
			printf("\nDeleted data is %d",head->data);//if only one node is presesnt
			head=NULL;
		}
		else
		{
			q=head;
			p=head;
			while(q->next!=head)
			{
				q=q->next;
			}
			q->next=head->next;
			head=head->next;
			p->next=NULL;
			printf("\nDeleted data is %d",p->data);
		}
	}
}
void delend()
{
	struct node *p,*q;
	if(head==NULL)
	{
		printf("\nEmpty List");
	}
	else
	{
		if(head==head->next)
		{
			printf("\nDeleted data is %d",head->data);
			head=NULL;
		}
		else
		{
			p=head;
			q=head;
			while(p->next!=head)
			{
				q=p;
				p=p->next;
			}
			q->next=head;
			p->next=NULL;
			printf("\nDeleted data is %d",p->data);
		}
	}
}
void delanypos()
{
	int i=1,pos;
	struct node *p,*q;
	if(head==NULL)
	{
		printf("Empty List");
	}
	else
	{
		printf("enter any position");
		scanf("%d",&pos);
		if(pos==1&&head->next==head)
		{
			printf("Deleted data is %d",head->data);
			head=NULL;
		}
		else
		{
			p=head;
			q=head;
			i=1;
			while(i!=pos&&p->next!=head)
			{
				q=p;
				p=p->next;
				i++;
			}
			if(i==pos&&p->next==head)
			{
				q->next=head;
				printf("Deleted data is %d ",p->data);
			}
			else if(i==pos&&p->next!=head)
			{
				q->next=p->next;
				p->next=NULL;
				printf("Deleted data is %d",p->data);
			}
			else
			{
				printf("Position not found");
			}
		}
	}
}
int search(int key)
{
	int f=0,k=1;
	struct node *p;
	if(head==NULL)
	{
		printf("\nEmpty list");
	}
	else
	{
		p=head;
		do
		{
			if(p->data==key)
			{
				f=1;
				break;
			}
			p=p->next;
			k++;
		}while(p!=head);
	}
	return f;
}
void distance()
{
	int n1,n2,k1,k2,c=0;
	struct node *p,*q;
	if(head==NULL)
	{
		printf("\nList is empty\n");
	}
	else
	{
		printf("\nEnter the first node ");
		scanf("%d",&n1);
		printf("\nEnter the second node ");
		scanf("%d",&n2);
		k1=search(n1);
		k2=search(n2);
		if(k1==1&&k2==1)
		{
			p=head;
			while(p->next!=head)
			{
				if(p->data==n1)
				{
					q=p;
					while(q->data!=n2)
					{
						c++;
						q=q->next;
					}
					break;
				}
				p=p->next;
			}
			printf("Distance between two given nodes is %d",c);
		}
		else
		{
			printf("\nNumbers not found \n");
		}
	}
}
void display()
{
	struct node *p;
	if(head==NULL)
	{
		printf("\nEmpty List");
	}
	else
	{
		p=head;
		do
		{
			printf("| %d |->",p->data);
			p=p->next;
		}
		while(p!=head);
		printf("HEAD");
	}
}
