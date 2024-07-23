//Write a C program to copy one array to another using pointer.

#include <stdio.h>
void main() 
{
   int i,n, sum = 0;
   int *p;
   	
   printf(" Enter the number of elements to store in the array: ");
   scanf("%d",&n);
   
   int arr1[n];
   int arr2[n]; 
   
   printf(" Enter the elements of the array : \n");
   for(i=0;i<n;i++)
    {
	  scanf("%d",&arr1[i]);
	} 	

   p = arr1; 
 
   for (i = 0; i < n; i++) 
   {
      arr2[i] = *p;
      p++;
   }
 	
   printf(" The elements of the 1st array (arr1) is : \n");
   for(i=0;i<n;i++)
    {
	  printf("%d\n",arr1[i]);
	}
	
   printf(" The elements of the 2nd array (arr2) is : \n");
   for(i=0;i<n;i++)
    {
	  printf("%d\n",arr2[i]);
	} 
	getch();
}

