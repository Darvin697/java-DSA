public class regr{


    public static int f(int n){
        
        if (n<=1) {
            System.out.println("first check for n<=1 :: " + n);
            return  n;
        }
        System.out.println();

        int b = f(n-1);
        System.out.println("second check for f(n-1) :: " + b );
        System.out.println("print for inside the function :: "+n );
         int x = f(n-1);
        return x;


    }
    public static void main(String[] args) {
        int y = f(5);
        System.out.println("last n(x) :" + y); 
    }





}