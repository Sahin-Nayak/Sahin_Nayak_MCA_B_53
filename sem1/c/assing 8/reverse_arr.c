//Write a C program to reverse an array using pointers.


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
 
   for (i = n-1; i >= 0; i--) 
   {
      arr2[i] = *p;
      p++;
   }
   
   printf(" The original array is : \n");
   for(i=0;i<n;i++)
    {
	  printf("%d\n",arr1[i]);
	} 
	
   printf(" The reverse array is : \n");
   for(i=0;i<n;i++)
    {
	  printf("%d\n",arr2[i]);
	} 
	getch();
}

