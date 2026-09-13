package Demo;

// 

public class traverse {
    public static void main(String[] args){
        char[] arr = {'a','b','c','d','e','\0','\0','\0','\0','\0'};
        for(int i = 0; i < 5; i++){
            arr[i+5] = arr[i];
        }

        System.out.print("[");

        for(int i =0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        
            }
            
        }
        
    

