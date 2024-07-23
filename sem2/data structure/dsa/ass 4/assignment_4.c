//1. Write a C program to search an element recursively in a binary search tree.
//2. Write a C program to delete a node having no child from a binary search tree.
//3. Write a C program to delete a node having one child from a binary search tree.
//4. Write a C program to delete a node having two children from a binary search tree.
//5. Write a C program to delete a node from a binary search tree.

//         50
//        /  \
//      30    80
//     /  \  /
//   10  40  60
//  /  \   \
// 5   15   45

#include<stdio.h>
#include<stdlib.h>
#include<string.h>

struct node{
    int data;
    struct node* left;
    struct node* right;
};
int count=0;

struct node* newnode(struct node* head, int x){
    if(head==NULL){
        head=(struct node* )malloc(sizeof(struct node));
        head->data=x;
        head->left=NULL;
        head->right=NULL;
    }
    return ;
}

struct node* create_bst(struct node* head, int x){
    if(head==NULL){
        head= newnode(head,x);
        return head;
    }

    else if(x<=head->data){
        head->left=create_bst(head->left, x);
    }
    else{
        head->right=create_bst(head->right, x);
    }
    return;
}

struct node* search_bst(struct node* head, int search){
	
    if(head==NULL){
    	printf("Element %d is not found",search);
    }
    else if( head->data==search){
    	printf("Element %d is found",search);
	}
    else if(head->data > search){
		search_bst(head->left,search);
	}
	else{
		search_bst(head->right,search);
	}
}

struct node* inorder_Succ(struct node* head){
	
	struct node* curr=head;
	while(curr && curr->left != NULL){
		curr=curr->left;
	}
	return curr;
}

struct node* deleteNode(struct node* head, int value) {

    if (head == NULL) {
        printf("\nTree is empty\n");
        return ; 
    }
    if (value < head->data) {
        head->left = deleteNode(head->left, value);
    } else if (value > head->data) {
        head->right = deleteNode(head->right, value);
    } else {

        if (head->left == NULL) {
            struct node* temp = head->right;
            free(head);
            return temp;
        } else if (head->right == NULL) {
            struct node* temp = head->left;
            free(head);
            return temp;
        }
        struct node* temp = inorder_Succ(head->right);
       	head->data=temp->data;
       	head->right = deleteNode(head->right , temp->data);
    }
    return head;
}

void inorder(struct node* head){
    if(head!=NULL){
        inorder(head->left);
        printf("%d\t", head->data);
        inorder(head->right);
    }
}

int main(){
    struct node* head=NULL;
    int x,choice,search;
    
    printf("\n 1. Insert Element\n 2. Display In Inorder\n 3. Search Element\n 4. delete node (having no child, having one child, having two child)\n 5. Exit\n");
    while(1){
    	
    	printf("\nEnter your choice :");
    	scanf("%d",&choice);
    	switch(choice){
    		case 1 : 	printf("\nEnter the value of the node :");
    					scanf("%d",&x);
						head=create_bst(head,x);
						break;
						
			case 2 :    inorder(head);
						break;
										
    		case 3 : 	printf("\nEnter the element that to be search :");
    					scanf("%d",&search);
						search_bst(head,search);
						break;
						
			case 4 :    printf("\nEnter the element that to be delete :");
    					scanf("%d",&search);
						head= deleteNode(head, search);
						break;
			
			case 5 :    exit(0);
			default :   printf("\nyou enter wrong choice.. ");
		}
	}
    return 0;
}
