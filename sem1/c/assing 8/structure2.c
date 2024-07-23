//Write a C program to read and print an Employee’s Details using Structure.

#include<stdio.h>

struct  employee
{
char name[50] ;
int empId ;
int age ;
float salary ;
} ;

int  main( )
{
struct employee emp ;

/* read employee details */
printf("\n Enter employee details !\n") ;
printf("\n Name : ") ;
gets(emp.name ) ;
printf("\n ID : ") ;
scanf("%d",&emp.empId ) ;
printf("\n Age : ") ;
scanf("%d",&emp.age ) ;
printf("\n Salary : ") ;
scanf("%f",&emp.salary ) ;

/* print employee details */
printf("\n Entered employee detail are !" ) ;
printf("\n Name: %s" ,emp.name ) ;
printf("\n Id: %d" ,emp.empId ) ;
printf("\n Age: %d" ,emp.age ) ;
printf("\n Salary: %f\n",emp.salary ) ;
return 0 ;
}
