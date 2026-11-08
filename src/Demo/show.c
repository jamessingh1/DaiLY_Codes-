#include <stdio.h>

void movezeroes(int arr[],int size){
int write = 0;
//size = sizeof(arr)/sizeof(arr[0]);
for(int read = 0; read < size; read++){
    if(arr[read] != 0) {
        if (read != write){
            int temp = arr[write];
            arr[write] = arr[read];
            arr[read] = temp;
        }
        write++;
    }
}
}

int main(){
    int arr[] = {1,0,13,2,0,0,9};
    int size = sizeof(arr)/sizeof(arr[0]);
    movezeroes(arr,size);
    printf("Elements in the array are: ");{
        for(int i=0; i<size; i++) {
            printf("%d ", arr[i]);
        }
        printf("\n");
    }
}

