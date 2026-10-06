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

// display elements inside linked list

void display(struct node *temp){
    if(temp == NULL){
        printf("Empty List. \n");
        return;
    }

    printf("Current List element: \n");
    while (temp != NULL){
        printf("%d ->", temp -> data);
        temp = temp -> next;
    }
    printf("Null\n");
}

int main(){
    struct node* head = NULL;
    int value;

    printf("Enter the value that you want to insert: \n");
    scanf("%d",&value);
    printf("Displaying the element inside linked list: \n");
    display(head);
}