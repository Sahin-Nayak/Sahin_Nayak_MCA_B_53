//Write a C program to create a structure named company which has name, address, phone and noOfEmployee as member variables. Read name of company, its address, phone and noOfEmployee. Finally display these members" value.

#include<stdio.h>

struct  company
{
char name[50] ;
char address[100];
int phone ;
int noOfEmployee ;
} ;

int  main( )
{
struct company com ;

/* read company details */
printf("\n Enter company details =\n") ;
printf("\n Name : ") ;
gets(com.name ) ;
printf("\n Address : ") ;
gets(com.address ) ;
printf("\n Phone : ") ;
scanf("%d",&com.phone ) ;
printf("\n No Of Employee : ") ;
scanf("%d",&com.noOfEmployee ) ;

/* print company details */
printf("\n Entered company detail are =" ) ;
printf("\n Name: %s" ,com.name ) ;
printf("\n Address: %s" ,com.address ) ;
printf("\n Phone: %d" ,com.phone ) ;
printf("\n No Of Employee: %d\n",com.noOfEmployee ) ;
return 0 ;
}
