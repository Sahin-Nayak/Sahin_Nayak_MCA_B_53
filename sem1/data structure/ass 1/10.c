// Write a C program to do sum of all elements of an array

#include<stdio.h>
int main(){
	int i,n,sum=0; 
	printf("Enter The Number Of Terms : ");
	scanf("%d",&n); 
	int a[n]; 
	printf("\nEnter The Element Of The Array : ");
	for(i=0;i<n;i++){
		scanf("%d",&a[i]);
	}
	for(i=0;i<n;i++){
		sum=sum+a[i];
	}
	printf("\nSum of All Element Is : %d",sum);
	return 0;
}
