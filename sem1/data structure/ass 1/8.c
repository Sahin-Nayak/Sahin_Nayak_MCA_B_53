// Write a program that reads a 2D metrics and checks if the metrics is a symmetric metrics or not.
 
#include<stdio.h>
int main()
{
 	int i, j, r,c, a[10][10], b[10][10], count = 1;
 	printf("\n Please enter number of rows and column  :  ");
 	scanf("%d %d", &r, &c);
 	printf("\n Please Enter the matrix elements \n");
 	for(i = 0; i < r; i++)
  	{
   		for(j = 0;j < c;j++)
    	{
      		scanf("%d", &a[i][j]);
    	}
  	}
 	for(i = 0; i < r; i++)
  	{
   		for(j = 0;j < c; j++)
    	{
      		b[j][i] = a[i][j];
    	}
  	}
  	printf("The transpose matrix is=\n");
  	for(i = 0; i < r; i++)
  	{
   		for(j = 0;j < c; j++)
    	{
      		printf("%d ",a[i][j]);
    	}
    	printf("\n");
  	}
 	for(i = 0; i < r; i++)
  	{
   		for(j = 0; j < c; j++)
    	{
    		if(a[i][j] != b[i][j])
    		{
    			count++;  
				break;  		
			}
   	 	}
  	}
  	if(count == 1)
  	{
  		printf("\n The Matrix that you entered is a symmetric Matrix ");
	}
	else
	{
		printf("\n The Matrix that you entered is Not a symmetric Matrix ");
	}
 	return 0;
}
