

public class SquareHollow {
    public static void  star(int n){
        

        for (int i = 0; i < n; i++) {   // for printing the outer pattern  

            for (int j = 0; j < n; j++) { // for printing the innner pattern 

                if (i == 0 || j == 0 || i == n-1 || j == n-1) {  // if any of this becomes true then the print works that is the element is in the outer side 
                    System.out.print("*");
                    
                }
                else{
                    System.out.print(" ");
                }
                
            }

            System.out.println();
            
        }

    }


public static void main(String[] args) {
    int n = 6;
    star(n);
}



}
