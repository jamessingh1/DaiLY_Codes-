#include <stdio.h>
#include <stdlib.h>

struct node{
    struct node* prev;
    int data;
    struct node* next;
};

struct node* head = NULL;
struct node* tail = NULL;

void insertatend(int value){
    struct node* newnode = (struct node*)malloc(sizeof(struct node));
    newnode -> data = value;
    newnode -> next = NULL;

    if (head == NULL){
        newnode->prev = NULL;
        head = tail = newnode;
        return;
    }

    tail -> next = newnode;
    newnode->prev = tail;
    tail = newnode;
}

void display(){
    struct node* temp = head;
    printf("List:  ");
    while(temp != NULL){
        printf("%d <-> ", temp -> data);
        temp = temp -> next;
    }
    printf("Null\n");
}

int main(){
    insertatend(10);
    insertatend(20);

    display();
}