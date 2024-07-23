//Write a C program to sort an array.

#include<stdio.h>
int main(){
	int i,n,j,swap; 
	printf("Enter The Number Of Terms : ");
	scanf("%d",&n); 
	int a[n]; 
	printf("\nEnter The Element Of The Array : ");
	for(i=0;i<n;i++){
		scanf("%d",&a[i]);
	}
	for(i=0;i<n;i++){	
		for(j=0;j<n;j++){
			if(a[i]<a[j]){
				swap=a[i];
				a[i]=a[j];
				a[j]=swap;
			}
		}
	}
	printf("\nThe Sorted Array Is : ");
	for(i=0;i<n;i++){
		printf("\n%d",a[i]);
	}
	return 0;
}
