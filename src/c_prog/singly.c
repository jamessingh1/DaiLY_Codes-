#include <stdio.h>
#include <stdlib.h>

struct node{
   int data;
   struct node* next;
};

struct node* head = NULL;
struct node* tail = NULL;

struct node* createnode(int value){
    struct node* newnode = (struct node*)malloc(sizeof(struct node));
    if(newnode == NULL){
        printf("Memory allocation failed!\n");
        return NULL;
    }

    newnode -> data = value;
    newnode -> next = NULL;
    return newnode;
}

void insert(int value){
    struct node* newnode = createnode(value);
    if(newnode == NULL) return;

    if (head == NULL){
        head = tail = newnode;
        return;
    }
    tail -> next = newnode;
    tail = newnode;
}

void delete(){
    if (head == NULL){
        printf("List is Empty!\n");
        return;
    }

    struct node* temp = head;
    head = head -> next;

    if (head == NULL){
        tail = NULL;
    }
    printf("Deleted Value: %d\n", temp -> data);
    free(temp);
}