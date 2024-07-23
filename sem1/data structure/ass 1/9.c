// write a program to print reverse array

#include<stdio.h>
int main(){
	int i,n; 
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
	printf("\nreverse Array Is : ");
	for(i=n-1;i>=0;i--){
		printf("\n%d",a[i]);
	}
	return 0;
}
