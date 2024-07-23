//char name[100];
//char address[100];
//int phone;

#include<stdio.h>
#include<conio.h>

typedef struct company
{
   	char name[100];
	char address[100];
	int phone;	
};

void read(struct company *com)
{
	printf("\nEnter the name of employee :");
	scanf("%s",&com->name);
	printf("\nEnter the address of employee :");
	scanf("%s",&com->address);
	printf("\nEnter the phone of employee :");
	scanf("%d",&com->phone);
}

void display(struct company *com)
{
	printf("\nEnter the name of employee :");
	printf("%s",com->name);
	printf("\nEnter the address of employee :");
	printf("%s",com->address);
	printf("\nEnter the phone of employee :");
	printf("%d",com->phone);
}

void main()
{
	int n,i;
	
	printf("\nEnter the no of employee :");
	scanf("%d",&n);
	
	struct company com[n];
	printf("\nEnter the details of employee :\n");
	for(i=0;i<n;i++)
	{
		printf("\nEnter The %d th Employee Details : \n",i);
		read(&com[i]);
	}
	printf("\nEnter the details of employee :\n");
	for(i=0;i<n;i++)
	{
		printf("\nEnter The %d th Employee Details : \n",i);
		display(&com[i]);
	}
}
