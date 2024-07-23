// delete a file

#include<stdio.h>
int main() {
   int del = remove("textFile.txt");
   if (!del)
      printf("The file is Deleted successfully");
   else
      printf("the file is not Deleted");
   return 0;
}
