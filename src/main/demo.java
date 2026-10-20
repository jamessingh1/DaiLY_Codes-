class demo{
    public static void main(String[] args) {
        
        int n = 0;
        int m = 0;

        int nums[] = new int[5];
        String str = null; 

       try{
         m = 9/n;
         System.out.println(str.length()); // Null Pointer Exception!
         System.out.println(nums[2]);
        }

         

        catch(ArithmeticException e){ //it will check only the arithmetic exception
            System.out.println("You are Facing arithmetic exception!" + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Hey Don't cross your array limit! \n");
        }

        //Exception e is the parent Class it's having the list of all the exception.
       catch(Exception e){ // exception will also throw as object that's why we have taken e here.
            System.out.println("Something went wrong..." + e);
        }
        System.out.println(m);
       // System.out.printf("This is a %s\n%s program\n", "Java", "Java");
        System.out.println("Hey But i get executed due to exception Handling!");
    }
}