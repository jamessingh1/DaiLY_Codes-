#include <stdio.h>

int main(){
    int nums[] = {30,8,9,10,12};
    int target = 89;
    int index = linearsearch(nums,target);
    if(index != -1)
       printf("Linear Search: target %d found at index %d\n", target,index);
    else
       printf("Element %d not found", target);
}

int linearsearch(int nums[],int target){
    int n = sizeof(nums)/sizeof(nums[0]);
    for (int i = 0; i < n-1; i++){
        if(nums[i] == target){
            return i;
        }
        return -1;
    }
}