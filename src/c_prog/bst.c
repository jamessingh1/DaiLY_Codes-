#include <stdio.h>
#define max_size 50

void initializeTree(int tree[]) {
    for(int i = 0; i < max_size; i++){
        tree[i] = -1;
    }
}

void insert(int tree[], int element, int currentIndex){
    if(currentIndex >= max_size){
        printf("Tree is full!\n");
        return;
    }

    if(tree[currentIndex] == -1){
       tree[currentIndex] = element;
       return;
    }

    if(element < tree[currentIndex]){
        insert(tree, element, 2 * currentIndex + 1);
    }
    else if(element > tree[currentIndex]){
        insert(tree, element, 2 * currentIndex + 2);
    }
}

void print(int tree[], int currentIndex){
    if(currentIndex >= max_size || tree[currentIndex] == -1)
       return;

       print(tree, 2 * currentIndex + 1);
       printf("%d", tree[currentIndex]);
       print(tree, 2 * currentIndex + 2);
}

int main(){
    int tree[max_size];

    initializeTree(tree);

    int elements[] = {70,90,10,20,53,22};
    int n = sizeof(elements)/sizeof(elements[0]);
    for(int i=0; i<n; i++){
        insert(tree, elements[i], 0);
    }

    printf("Sorted Tree Output: ");
    print(tree,0);
    printf("\n");

    return 0;
}