#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node *next; 
};


int main() {
    struct node *head = NULL;
    struct node *newnode = (struct node*)malloc(sizeof(struct node));
    newnode -> data = 99;
    newnode -> next = NULL;
    head = newnode;

    struct node *first = (struct node*)malloc(sizeof(struct node));

    first ->data = 2;
    first ->next = NULL;
   // head = first;
    newnode -> next = first;

    struct node *second = (struct node*)malloc(sizeof(struct node));
    second ->data = 4;
    second ->next = NULL;

    first -> next = second;

    struct node *third = (struct node*)malloc(sizeof(struct node));
    third -> data = 8;
    third -> next = NULL;

    second -> next = third;

    struct node *temp = head;

    while (temp != NULL) {
        printf("%d -> ", temp ->data);
        temp = temp->next;
    }
    printf("Null\n");
    return 0;
    
}