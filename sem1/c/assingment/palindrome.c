#include <stdio.h>
int main() {
  int n, reverse = 0, remainder, num;
    printf("Enter an integer: ");
    scanf("%d", &n);
    num = n;

    // reversed integer is stored in reversed variable
    while (n != 0) {
        remainder = n % 10;
        reverse = reverse * 10 + remainder;
        n /= 10;
    }

    // palindrome if orignal and reversed are equal
    if (num == reverse)
        printf("%d is a palindrome.", num);
    else
        printf("%d is not a palindrome.", num);

    return 0;
}