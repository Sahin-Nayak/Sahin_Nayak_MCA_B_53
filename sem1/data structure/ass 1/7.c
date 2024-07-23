//Write a program that reads two 2D matrices from the console, verifies if matrics multiplication is possible or not. Then multiplies the matrices and prints the 3rd matrics.

#include<stdio.h>
int main(){
   int r1, c1, r2, c2,i,j,k;
   printf("Enter rows and column for the first matrix: ");
   scanf("%d %d", &r1, &c1);
   printf("Enter rows and column for the second matrix: ");
   scanf("%d %d", &r2, &c2);

   while (c1 != r2) {
      printf("Error! Enter rows and columns again.\n");
      printf("Enter rows and columns for the first matrix: ");
      scanf("%d%d", &r1, &c1);
      printf("Enter rows and columns for the second matrix: ");
      scanf("%d%d", &r2, &c2);
   }
   int first[r1][c1], second[r2][c2], result[r1][c1];
   printf("\nEnter values for the first matrix:\n ");
   for(i=0;i<r1;i++){
   	    for(j=0;j<c1;j++){
   			scanf("%d",&first[i][j]);
	   }
   }
   printf("\nEnter values for the second matrix:\n ");
    for(i=0;i<r2;i++){
   	    for(j=0;j<c2;j++){
   			scanf("%d",&second[i][j]);
	   }
   }
    for(i=0;i<r1;i++){
   	    for(j=0;j<c1;j++){
   	    	result[i][j]=0;
   	    	for(k=0;k<r1;k++){
   				result[i][j]+=first[i][k]*second[k][i];
   			}
	   }
   }
   printf("\nThe resulting matrix is:\n ");
    for(i=0;i<r1;i++){
   	    for(j=0;j<c1;j++){
   			printf("%d  ",result[i][j]);
	   }
	   printf("\n");
   }
}
