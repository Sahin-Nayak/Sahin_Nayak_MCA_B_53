//Write a C program to print the largest and second largest element of the array.

#include<stdio.h>
int main(){
	int i,n,max=0,max_index,smax=0,smax_index; 
	printf("Enter The Number Of Terms : ");
	scanf("%d",&n); 
	int a[n]; 
	printf("\nEnter The Element Of The Array : ");
	for(i=0;i<n;i++){
		scanf("%d",&a[i]);
	}
	for(i=0;i<n;i++){
		if(a[i]>max){
			max=a[i];
			max_index=i;
		}
	}
	for(i=0;i<n;i++){
		if(a[i]>smax && max_index!=i){
			smax=a[i];
			smax_index=i;
		}
	}
	printf("\nThe Maximum Element Of The Array Is : %d Present At %d No. Index. \nThe Second Maximum Element Of The Array Is : %d Present At %d No. Index",max,max_index,smax,smax_index);
	return 0;
}
