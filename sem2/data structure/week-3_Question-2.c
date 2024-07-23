#include <stdio.h>
#include <stdlib.h>

// Structure for a BST node
struct Node {
   int data;
   struct Node *left;
   struct Node *right;
};

// Function to create a new node
struct Node *createNode(int data) {
   struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
   newNode->data = data;
   newNode->left = newNode->right = NULL;
   return newNode;
}

// Function to insert a node into the BST iteratively
struct Node *insert(struct Node *root, int data) {
   struct Node **current = &root;  // Pointer to pointer to traverse and update

   while (*current != NULL) {
       if (data < (*current)->data) {
           current = &(*current)->left;
       } else {
           current = &(*current)->right;
       }
   }

   *current = createNode(data);  // Insert the new node at the found position
   return root;
}

// Function to perform in-order traversal (non-recursive)
void inorderTraversal(struct Node *root) {
   struct Node *current = root;
   struct Node *stack[100];  // Assuming a maximum depth of 100
   int top = -1;

   while (current != NULL || top != -1) {
       while (current != NULL) {
           stack[++top] = current;
           current = current->left;
       }

       current = stack[top--];
       printf("%d ", current->data);
       current = current->right;
   }
}

int main() {
   struct Node *root = NULL;
   int choice, data;

   do {
       printf("\n1. Insert\n2. Display\n3. Exit\nEnter your choice: ");
       scanf("%d", &choice);

       switch (choice) {
           case 1:
               printf("Enter data to insert: ");
               scanf("%d", &data);
               root = insert(root, data);
               break;
           case 2:
               printf("In-order traversal: ");
               inorderTraversal(root);
               printf("\n");
               break;
           case 3:
               printf("Exiting...\n");
               break;
           default:
               printf("Invalid choice!\n");
       }
   } while (choice != 3);

   return 0;
}

