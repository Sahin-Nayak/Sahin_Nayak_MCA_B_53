// Write a C program to check duplicate number in an array.

#include<stdio.h>
int main(){
	int i,j,n,search,count; 
	printf("Enter The Number Of Terms : ");
	scanf("%d",&n); 
	int a[n]; 
	printf("\nEnter The Element Of The Array : ");
	for(i=0;i<n;i++){
		scanf("%d",&a[i]);
	}
	printf("\nentered Array Is : ");
	for(i=0;i<n;i++){
		printf("\n%d",a[i]);
	}
	printf("\n");
	for(i=0;i<n;i++){
		search= a[i];
		count=0;
		for(j=0;j<n;j++){
			if(i!=j && search==a[j]){
				count++;
			}
		}
		if(count==0){
			printf("\na[%d]=%d ---> No duplicate present in array",i,search);
		}
		else{
			printf("\na[%d]=%d ---> Present %d more time in the array",i,search,count);
		}
	}	
	return 0;
}
