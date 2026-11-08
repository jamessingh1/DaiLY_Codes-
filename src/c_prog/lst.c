#include <stdio.h>

int linearsearch(int arr[], int target, int n){
   for(int i = 0; i < n; i++){
      if(arr[i] == target){
         return i;
      }
   }
   return -1;
}

int main(){
    int arr[] = {30,49,77,12,11,34,90};
    int n = sizeof(arr)/sizeof(arr[0]);
    int target = 89;
    int result = linearsearch(arr, target, n);
    if(result != -1){
        printf("Element %d is found at index: ", target, result);  
    }
   else{
      printf("Element %d is not found\n", target);
   }
}