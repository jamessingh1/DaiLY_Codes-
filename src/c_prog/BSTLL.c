#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node* left;
    struct node* right;
};

struct node* createnode(int value){
   struct node* newnode = (struct node*)malloc(sizeof(struct node));
    newnode -> data = value;
    newnode -> left = NULL;
    newnode -> right = NULL;
    return newnode;
}

struct node* insert(struct node* root, int value){
    if(root == NULL){
        return createnode(value);
    }

    if (value < root->data){
        root->left = insert(root->left,value);
    }

    else if(value > root->data){
        root->right = insert(root->right,value);
    }

    return root;
}

int main(){
    struct node* root = NULL;

    root = insert(root,50);
}