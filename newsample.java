import java.util.HashSet;
import java.util.Set;

public class newsample {
    public static int[] twonumberSum(int[] array,int target){
        Set<Integer> nums = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            int num = array[i];

            int match = target - num;
            if (nums.contains(num)) {
                return new int[]{num,match};
                
            }else{
                nums.add(match);
            }
            
        }return new int[0];

    }


public static void main(String[] args) {
    int[] array = {6,4,5,7,2,9};
    int target = 10;
    int[] result = twonumberSum(array, target);
    for (int i = 0; i < result.length; i++) {
        System.out.println(result[i]);
        
    }
}    
}
