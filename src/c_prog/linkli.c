#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node* next;
};

struct node* head = NULL;

void insertend(int value){
    struct node *newnode = (struct node*)malloc(sizeof(struct node));
    newnode -> data = value;
    newnode -> next = NULL;

    if(head == NULL){
        head = newnode;
        printf("Inserted %d as head node.\n", value);
        return;
    }

    struct node* temp = head;
    while(temp ->next != NULL){
        temp = temp ->next;
    }

    temp ->next = newnode;
    printf("Inserted %d at the end.\n", value);
}


//Deletion

void deletenode(int value){
    if (head == NULL){
        printf("List is Empty!");
        return;
    }

    struct node* temp = head;
    struct node* prev = NULL;

    if(temp != NULL && temp->data == value){
        head = temp->next;
        free(temp);
        printf("Deleted %d.\n",value);
        return;
    }

    while(temp!= NULL && temp -> data != value){
        prev = temp;
        temp = temp -> next;
    }

    if(temp == NULL){
        printf("Value %d is not found in list.\n", value);
        return;
    }

    prev->next = temp->next;
    free(temp);
    printf("Deleted %d.\n", value);
} 

void display(){
    if (head == NULL){
        printf("List: empty\n\n");
        return;
    }

    struct node* temp = head;
    printf("List Status: ");
    while(temp != NULL){
        printf("%d -> ", temp -> data);
        temp = temp->next;
    }
    printf("NULL\n\n");
}



int main(){
    insertend(2);

    deletenode(2);

    display();
    return 0;
}