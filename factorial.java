public class factorial{


    public static  int fa(int n){

        if (n <= 1) {
            return n;
            
        }
        
        int result =  (n * fa(n-1));
          return  result;

    }

    public static void main(String[] args) {
       int result = fa(5);
       System.out.println(result);
        
    }


    
}