#include<stdio.h>

void main()
{
	 char s[100],i;
	printf("Enter the string : ");
	scanf("%c",&s);
	int len = strlen(s);
	printf("\nthe length is : %d",len);
	printf("\nthe entered string is : ");
	for(i=0;i<len;i++)
	{
		printf("%c",s[i]);
	}
}
