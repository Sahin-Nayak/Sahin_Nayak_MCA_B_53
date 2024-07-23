#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main()
{
	char ch;
	
	FILE *fp1=NULL;
	
	fp1=fopen("test.txt","w");
	
	if(fp1==NULL)
	{
		printf("file not exists");
		exit(1);
	}
	else
	{
		
	}
}
