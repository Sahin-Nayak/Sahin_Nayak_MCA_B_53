// fibo series

#include<stdio.h> 
int Fibonacci(int);
int main()
{
   int n, i, j=0;
   printf("Enter the range : ");
   scanf("%d",&n);
   printf("Fibonacci series :\n");
   for ( i = 1 ; i <= n ; i++ )
   {
      printf("%d  ", Fibonacci(i));
      j++; 
   }
   return 0;
}
int Fibonacci(int n)
{
   if ( n == 0 )
      return 0;
   else if ( n == 1 )
      return 1;
   else
      return ( Fibonacci(n-1) + Fibonacci(n-2) );
} 
