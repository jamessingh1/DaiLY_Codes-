#include <stdio.h>
int main(){
    int x = 30;
    int y = 59;
    int *ptr;

    ptr = &x;
    printf("Pointer address: %p, value: %d\n", (void*)ptr, *ptr);
    ptr = &y;
    printf("Pointer address: %p, value: %d\n", (void*)ptr, *ptr);

}