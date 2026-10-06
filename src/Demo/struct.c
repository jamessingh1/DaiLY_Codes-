#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node *next;
};

int main(){
struct node *head, *second, *third, *fourth;

head = (struct node*)malloc(sizeof(struct node));
second = (struct node*)malloc(sizeof(struct node));
third = (struct node*)malloc(sizeof(struct node));
fourth = (struct node*)malloc(sizeof(struct node));

head -> data = 25;
second -> data = 97;
third -> data = 34;
fourth -> data = 98;


head -> next = second;
second -> next = third;
third -> next = fourth;
fourth -> next = NULL;

struct node *temp = head;

while(temp != NULL){
    printf("%d\n", temp-> data);
    temp = temp -> next;
}
return 0;
}