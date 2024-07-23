#include<stdio.h>
#include<conio.h>

void main()
{
	char s[100],t[100],p[200],k;
	printf("Enter the string : ");
	gets(s);
	printf("Enter the string : ");
	gets(t);
	
	printf("\n the string is : %s",s);
	int i=0;
	printf("\n");
	while(t[i]!='\0')
	{
		printf("%c",t[i]);
		i++;
	}
	printf("\n");
	for(i=0;s[i]!='\0';i++)
	{
		p[i]=s[i];
	}
	p[i]=" ";
	i++;
	k=0;
	while(t[k]!='\0')
	{
		p[i]=t[k];
		i++;
		k++;
	}
	printf("\n");
	printf("new string : ");
	printf("%s",p);
}
