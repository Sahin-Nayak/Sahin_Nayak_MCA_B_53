//Write a C program to find the sum of all the elements of an array using pointers.

#include <stdio.h>
void main() 
{
   int i,n, sum = 0;
   int *p;
   	
   printf(" Enter the number of elements to store in the array: ");
   scanf("%d",&n);
   
   int arr1[n]; 
   
   printf(" Enter the elements of the array : \n");
   for(i=0;i<n;i++)
    {
	  scanf("%d",&arr1[i]);
	} 	

   p = arr1; 
 
   for (i = 0; i < n; i++) 
   {
      sum = sum + *p;
      p++;
   }
 
   printf(" The sum of all elements of the array is : %d ", sum);
}

