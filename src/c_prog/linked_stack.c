#include <stdio.h>
#include <stdlib.h>

struct node{
   struct node* prev;
   int data;
   struct node* next;
};

struct node* head = NULL;
struct node* tail = NULL;

struct node* createnode(int value){
    struct node* newnode = (struct node*)malloc(sizeof(struct node));
    if (newnode == NULL){
        printf("Insertion Failed!\n");
    }
    newnode -> prev = NULL;
    newnode -> data = value;
    newnode -> next = NULL;
    return newnode;
}