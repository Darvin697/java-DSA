public class problem2 {
    
    public static int[] sixnumber(int[] array,int limit){

        int i=0;
        int j=array.length -1;

        while (i < j) {
            while (j>i && array[j] == limit) {
                j--;
                
            }
            if (array[i] == limit) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                
            }
            i++;
        }
        return array;


    }
    public static void main(String[] args) {

        int[] a = {6,8,7,6,10,4,12,6,3,4,6};
        int b = 6;



        int[] array = sixnumber(a, b);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }
}
