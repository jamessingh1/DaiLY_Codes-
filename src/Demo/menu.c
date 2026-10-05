#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node* next;
};

void displayList(struct node *temp){
    if (temp == NULL){
        printf("Empty List. \n");
        return;
    }

    printf("Current list: ");
    while(temp != NULL){
        printf("%d -> ", temp -> data);
        temp = temp -> next;
    }
    printf("Null\n");
}

struct node* insert(struct node *head, int new){
    struct node *newNode = (struct node*)malloc(sizeof(struct node));
    newNode -> data = new;
    newNode -> next = head;
    return newNode;
}


int main(){
    struct node *head = NULL;
    int choice, value;

    while(1){
        printf("\nMenu-Driven Linked List Program\n");
        printf("1. Search\n");
        printf("2. Traversal\n");
        printf("3. Insertion\n");
        printf("4. Deletion\n");
        printf("5. Display \n");
        printf("6. Exit\n");

        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch(choice){
           case 1:
               printf("Searching Element \n");
               break;
            case 2:
                printf("Traversing Element\n");
                displayList(head);
                break;
            case 3:
                printf("Insertion selected \n");
                printf("Enter the value to insert: ");
                scanf("%d", &value);
                head = insert(head,value);
                printf("Successfully inserted !");
                break;
            case 4:
                printf("Deletion Selected \n");
                break;
            case 5:
                printf("Display Selected \n");
                break;
            case 6:
                printf("Exist \n");
                exit(0); 
            default :
                printf("Invalid choice! \n");
        }
    }
    return 0;
}