#include<stdio.h>
int stack[100],choice,n,top,x,i;
void push(void);
void pop(void);
void display(void);
int main()
{
    top=-1;
    printf("\n Enter the no of elements:");
    scanf("%d",&n);
    while(1)
    {
    	printf("\n 1.PUSH\n 2.POP\n 3.DISPLAY\n 4.PEEK\n5.EXIT");
        printf("\n Enter the Choice:");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1:
            {
                push();
                break;
            }
            case 2:
            {
                pop();
                break;
            }
            case 3:
            {
                display();
                break;
            }
            case 4:
            {
                peek();
                break;
            }
            case 5:
            {
                printf("\n Exit Succesfull ");
                break;
            }
            default:
            {
                printf ("\n\t Please Enter a Valid Choice");
            }
                
        }
        if(choice==5)
        {
        	break;
		}
    }
    return 0;
}
void push()
{
    if(top>=n-1)
    {
        printf("\n\tStack is over flow");
        
    }
    else
    {
        printf(" Enter a value to be pushed:");
        scanf("%d",&x);
        top++;
        stack[top]=x;
    }
}
void pop()
{
    if(top<=-1)
    {
        printf("\n\t Stack is under flow");
    }
    else
    {
        printf("\n\t The popped elements is %d",stack[top]);
        top--;
    }
}
void peek()
{
	printf("The top most element is : %d",stack[top]);
}
void display()
{
    if(top>=0)
    {
        printf("\n The elements in STACK \n");
        for(i=top; i>=0; i--)
            printf("\n%d",stack[i]);
        printf("\n Press Next Choice");
    }
    else
    {
        printf("\n The STACK is empty");
    }
   
}

