public class DSA_05_Recursion {
    public static void main(String[] args) {

        int result = fact(7);
        System.out.println(result);
    }
        public static int fact(int i){
         if(i!=0)
             return fact(i-1)*i;

            return 1;
        }

}
