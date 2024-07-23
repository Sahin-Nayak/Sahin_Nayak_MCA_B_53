#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<string.h>

void main()
{
	char ch;
	
	FILE *f1=NULL,*f2=NULL;
	
	f1=fopen("test.txt","r");
	f2=fopen("des.txt","aw");
	
	if(f1!=NULL && f2!=NULL)
	{
		printf("open successful");
		
		while((ch=fgetc(f1))!=EOF)
		{
			fputc(ch,f2);
		}
		fclose(f2);
		f2=fopen("des.txt","r");
		printf("the file is :");
		while((ch=fgetc(f2))!=EOF)
		{
			putch(ch);
		}
	}
	else
	{
		exit(0);	
	}
}
