
#include <stdio.h>
 
int main()
{
    int l, u, i, j, flag;
 
    printf("Enter lower bound : ");
    scanf("%d", &l); 
 
    printf("\nEnter upper bound : ");
    scanf("%d", &u); 
 
    printf("\nPrime numbers between %d and %d are: ", l, u);
 
    for (i = l; i <= u; i++) {
    	
        if (i == 1 || i == 0){
        	continue;
		}
        flag = 1;
 
        for (j = 2; j <= i / 2; ++j) {
            if (i % j == 0) {
                flag = 0;
                break;
            }
        }
 
        if (flag == 1)
            printf("%d ", i);
    }
 
    return 0;
}