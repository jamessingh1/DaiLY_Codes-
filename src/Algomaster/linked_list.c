#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node* next;
};

struct node* insert(struct node* head, int newvalue){
    struct node *newnode = (struct node*)malloc(sizeof(struct node));
    newnode -> data = newvalue;
    newnode -> next = head;
    return newnode;
}

int main(){
    struct node* head = NULL;
    int value;

    printf("Enter the value that you want to insert: \n");
    scanf("%d",&value);
}