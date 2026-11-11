#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node *left;
    struct node *right;
    int height;
};

int max(int a, int b){
    return(a>b)?a:b;
}

int getheight(struct node *n) {
    if (n == NULL) return 0;
    return n->height;
}

struct node* createnode(int data){
    struct node* Node = (struct node*)malloc(sizeof(struct node));
    Node->data = data;
    Node->left = NULL;
    Node->right = NULL;
    Node->height = 1;
    return Node;
}

int getbalance(struct node *n){
    if(n==NULL) return 0;
    return getheight(n->left) - getheight(n->right);
}

struct node *rightrotate(struct node *y){
    struct node *x = y->left;
    struct node *T2 = x->right;

    x->right = y;
    y->left = T2;

    y->height = max(getheight(y->left), getheight(y->right)) + 1;
    x->height = max(getheight(x->left), getheight(x->right)) + 1;

    return x;
}

struct node* leftrotate(struct node *x){
    struct node *y = x->right;
    struct node *T2 = y->left;

    y->left = x;
    x->right = T2;

    x->height = max(getheight(x->left), getheight(x->right)) + 1;
    y->height = max(getheight(y->left), getheight(y->right)) + 1;

    return y;
}

struct node* insert(struct node* node, int data){
    // 1. Normal BST Insertion
    if (node == NULL)
       return createnode(data);
    
    if (data < node->data)
        node->left = insert(node->left, data);
    else if (data > node->data)
        node->right = insert(node->right, data);
    else
        return node;

    // 2. Update Height
    node->height = 1 + max(getheight(node->left), getheight(node->right));

    // 3. Get Balance Factor
    int balance = getbalance(node);

    // 4. Rebalance Cases
    // LL Case
    if (balance > 1 && data < node->left->data)
        return rightrotate(node);
    
    // RR Case
    if (balance < -1 && data > node->right->data)
        return leftrotate(node);

    // LR Case
    if (balance > 1 && data > node->left->data) {
        node->left = leftrotate(node->left);
        return rightrotate(node);
    }

    // RL Case (FIXED HERE: balance < -1)
    if (balance < -1 && data < node->right->data){
        node->right = rightrotate(node->right);
        return leftrotate(node);
    }

    return node;
}

void preorder(struct node *root){
    if(root!=NULL){
        printf("%d", root -> data);
        preorder(root->left);
        preorder(root->right);
    }
}

int main(){
    struct node *root = NULL;

    root = insert(root,10);
    root = insert(root,20);
    root = insert(root,30);
    root = insert(root,40);
    root = insert(root,50);
    root = insert(root,25);

    printf("Preorder Traversal : \n");
    preorder(root);

    return 0;
}