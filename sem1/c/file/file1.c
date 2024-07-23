#include<stdio.h>
void main()
{
	FILE *f;
	char con[1000];
	f= fopen("text.txt","w+");  //fopen(file name, mode) // read,write,append,
	if(f!=NULL)
	{
		fputs("india ",f); // fputs("content,f)
			printf("content is: \n");
	while(fgets(con,1000,f)){
		printf("%s",con);
	}
	}
	else
	{
		printf("vag bsdk");
	}
	fclose(f);
	return 0;
}
