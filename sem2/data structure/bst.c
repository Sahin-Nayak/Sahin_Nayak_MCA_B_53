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

int count_node(struct node* head){
    if(head!=NULL){
    	count++;
        count_node(head->left);
        count_node(head->right);
    }
    return count;
}

int find_highest_num(struct node* head){
	
	if(head == NULL){
		return 0;
	}
	struct node* current = head;
	while(current->right!=NULL){
		current = current->right;
	}
	return current->data;
}

void inorder(struct node* head){
    if(head!=NULL){
        inorder(head->left);
        printf("%d\t", head->data);
        inorder(head->right);
    }
}

void preorder(struct node* head){
    if(head!=NULL){
    	printf("%d\t", head->data);
        preorder(head->left);
        preorder(head->right);
    }
}

void postorder(struct node* head){
    if(head!=NULL){
        postorder(head->left);
        postorder(head->right);
        printf("%d\t", head->data);
    }
}

int main(){
    struct node* head=NULL;
    int x,choice,search,node_num,highest_num;
    
    printf("\n 1. Insert Element\n 2. Display In Inorder / view elements in sorting order\n 3. Display In Preorder\n 4. Display In Postorder\n 5. Search Element\n 6. Count Node\n 7. Find Highest Element\n 8. Exit\n");
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
						
			case 3 :    preorder(head);
						break;
					
			case 4 :    postorder(head);
						break;
						
    		case 5 : 	printf("\nEnter the element that to be search :");
    					scanf("%d",&search);
						search_bst(head,search);
						break;
						
			case 6 :    node_num=count_node(head);
						printf("\nTotal number of node is : %d",node_num);
						break;
						
			case 7 :    highest_num = find_highest_num(head);
						if(highest_num==0){
							printf("Tree is empty");
							break;
						}
						else{
							printf("\nHighest number in BST is : %d",highest_num);
							break;	
						}
									
			case 8 :    exit(0);
			default :   printf("\nyou enter wrong choice.. ");
		}
	}
    return 0;
}
