// print an array

#include<stdio.h>
#include<conio.h>
void main()
{
	int n,i,j;
	printf("Enter the number of terms: ");
	scanf("%d",&n);
	int a[n];
	printf("\nEnter the elements :\n");
	for(i=0;i<n;i++){
		scanf("%d",&a[i]);
	}
	printf("The array elements are :\n");
	for(i=0;i<n;i++){
		printf("%d\n",a[i]);
	}
}
