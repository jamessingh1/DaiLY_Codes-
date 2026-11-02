#include <stdio.h>
#include <stdlib.h>

struct node{
   struct node* prev;
   int data;
   struct node* next;
};

struct node* top = NULL;

void push(int value){
    struct node* newnode = (struct node*)malloc(sizeof(struct node));
    if(newnode == NULL){
        printf("Stack Overflow!");
        return;
    }
    newnode -> prev = NULL;
    newnode -> data = value;
    newnode -> next = top;
    return newnode;
}

