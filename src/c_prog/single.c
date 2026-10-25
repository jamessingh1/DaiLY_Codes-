#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node* next;
};

struct node* head = NULL;
struct node* tail = NULL;


// insertend because it will simply follow the queue structure
void insertatend(int value){
     struct node* newnode = (struct node*)malloc(sizeof(struct node));
     newnode->data = value;
     newnode->next = NULL;

     if (head == NULL){
        head = tail = newnode;
        return;
     }

    tail->next = newnode;
    tail = newnode;
}

void display(){
    if(head == NULL){
        printf("List is empty!\n");
        return;
    }

    struct node* temp = head;
    printf("List:  ");

    while(temp != NULL){
        printf("%d ", temp->data);
        temp = temp->next;
    }

    printf("Null\n");
}

int main(){
    insertatend(4);
    insertatend(8);
    insertatend(10);
    insertatend(12);

    display();
}