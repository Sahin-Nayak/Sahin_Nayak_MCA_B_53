//structure

#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

typedef struct student
{
	char name[100];
	char address[100];
	int roll;
	char section;
	int phone;
};

void read( struct student *s)
{
	printf("Enter the student name :");
	scanf("%s",&s->name);
	
	printf("Enter the student address :");
	scanf("%s",&s->address);
	
	printf("Enter the student roll :");
	scanf("%d",&s->roll);
	
	printf("Enter the student section :");
	scanf("%s",&s->section);
	
	printf("Enter the student phone :");
	scanf("%d",&s->phone);	
}

void print(struct student *s)
{
	printf("%s",s->name);
	printf("%s",s->address);
	printf("%d",s->phone);
	printf("%d",s->roll);
	printf("%c",s->section);	
}


int main()
{
	
	int i,total;
	 
	printf("Enter the total student :");
	scanf("%d",&total);
	
	struct student stu[total];
	printf("\nenter the details of the student : \n");
	for(i=0;i<total;i++)
	{
		read(&stu[i]);	
	}
	printf("\ndetails of the student : ");
	
	for(i=0;i<total;i++)
	{
		print(&stu[i]);
		printf("\n");
	}
	
	
}
