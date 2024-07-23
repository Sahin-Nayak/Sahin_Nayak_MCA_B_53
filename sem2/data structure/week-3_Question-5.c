//sahinnayak

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

typedef struct Node {
    char data;
    struct Node *left;
    struct Node *right;
} Node;


Node *createNode(char data) {
    Node *newNode = (Node *)malloc(sizeof(Node));
    newNode->data = data;
    newNode->left = newNode->right = NULL;
    return newNode;
}

// Function to insert a node into the BST
Node *insert(Node *root, char data) {
    if (root == NULL) {
        return createNode(data);
    }

    if (data < root->data) {
        root->left = insert(root->left, data);
    } else {
        root->right = insert(root->right, data);
    }

    return root;
}

// In-order traversal to print the sorted characters
void inorderTraversal(Node *root) {
    if (root != NULL) {
        inorderTraversal(root->left);
        if(root->data != " "){
        	printf("%c", root->data);
		}
		else{
			printf(" ");
		}
        inorderTraversal(root->right);
    }
}

// Free the memory allocated for the BST nodes
void freeTree(Node *root) {
    if (root != NULL) {
        freeTree(root->left);
        freeTree(root->right);
        free(root);
    }
}

int main() {
    char userName[100];
    Node *root = NULL;
    int i;

    printf("Enter your name: ");
    fgets(userName, sizeof(userName), stdin);


    if (userName[strlen(userName) - 1] == '\n') {
        userName[strlen(userName) - 1] = '\0';
    }


    for (i = 0; userName[i] != '\0'; i++) {
        userName[i] = tolower(userName[i]);
    }


    for (i = 0; userName[i] != '\0'; i++) {
        root = insert(root, userName[i]);
    }

    printf("Sorted sequence of characters in your name: ");
    inorderTraversal(root);
    printf("\n");

    freeTree(root);

    return 0;
}

