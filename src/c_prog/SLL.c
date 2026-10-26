#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node* next;
}; 

// declare pointer variable

struct node* head = NULL;
struct node* tail = NULL;

// Node Creation

struct node* createnode(int value){
    struct node* newnode = (struct node*)malloc(sizeof(struct node));
    if (newnode == NULL){
        printf("Memory allocation failed!\n");
        return NULL;
    }
    newnode -> data = value;
    newnode -> next = NULL;
    return newnode;
}

// insertion

void insert(int value){
    struct node* newnode = createnode(value);
    if(newnode == NULL) return;

    if (head == NULL){
        head = tail = newnode;
        return;
    }
    tail->next = newnode;
    tail = newnode;
}

void display(){
    if(head == NULL){
        printf("List is Empty!\n");
        return;
    }

struct node* temp = head;
printf("List: ");
while(temp!=NULL){
    printf("%d->", temp -> data);
    temp = temp -> next;
}
printf("NULL\n");
}

int main(){
    insert(20);
}