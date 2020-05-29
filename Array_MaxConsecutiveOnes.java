import java.util.Arrays;
import java.util.Random;

public class Array_MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {

        int counter = 0;
        int temp = 0;

        for (int num : nums){

            if (num == 1){
                temp++;
            }
            if (temp > counter){
                counter = temp;
            }
            if (num == 0){
                temp = 0;
            }

        }
        return counter;

    }

    public static void main(String[] args) {

        int[] nums = new int[10];

        initArray(nums);

        System.out.println(Arrays.toString(nums));

        System.out.println("Max Consecutives: " + findMaxConsecutiveOnes(nums));
    }

    public static void initArray(int[] nums){

        Random rd = new Random();

        for (int x=0; x<nums.length; x++){
            nums[x] = rd.nextInt(2);
        }
    }
}

