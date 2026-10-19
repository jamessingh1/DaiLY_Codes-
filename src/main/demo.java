class demo{
    public static void main(String[] args) {
        
        int n = 0;
        int m = 0;
       try{
         m = 9/n;
        }
        catch(Exception e){ // exception will also throw as object that's why we have taken e here.
            System.out.println("Something went wrong..." + e);
        }
        System.out.println(m);
       // System.out.printf("This is a %s\n%s program\n", "Java", "Java");
        System.out.println("Hey But i get executed due to exception Handling!");
    }
}