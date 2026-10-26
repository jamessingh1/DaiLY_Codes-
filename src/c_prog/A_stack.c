#include <stdio.h>
#define MAX 5

int stack[MAX];
int top = -1;

void push(int value){
    if (top == MAX - 1){
        printf("Stack is Overflowing!");
        return;
    }
    stack[++top] = value;
}

int pop(){
    if (top == -1){
        printf("Stack Overflow!n");
        return -1;
    }
   return stack[top--];
}

void display(){
    if(top == -1){
        printf("Stack is Empty!\n");
        return;
    }
  printf("Stack Element:  \n");
  for(int i = top; i >= 0; i--){
    printf("%d\n", stack[i]);
  }
  printf("\n");
}

int main(){

    push(20);
    push(30);
    push(1);
    push(0);
    push(21);

    pop();
    display();
    pop();
    display();
    pop();
    display();
    pop();
    display();
    pop();
    display();
}