import java.util.Arrays;
import java.util.Random;

public class Array_EvenDigits {

    public static void main(String[] args) {

        int[] nums = new int[10];

        initArray(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("Method 1: Even Digits in Array: " + findNumbers1(nums));
        System.out.println("Method 2: Even Digits in Array: " + findNumbers2(nums));
        System.out.println("Method 3: Even Digits in Array: " + findNumbers3(nums));
        System.out.println("Method 4: Even Digits in Array: " + findNumbers4(nums));

    }

    public static void initArray(int[] nums){

        Random rd = new Random();

        for (int x=0; x<nums.length; x++){          // aufgabenstellung: zahlen bis 10^5
            nums[x] = rd.nextInt(100001);
        }

    }

    public static int findNumbers1(int[] nums){     // meine methode

        int counter = 0;

        for (int x : nums) {
            if (9 < x && x < 100 || 999 < x && x < 10000 || x == 100000) {
                counter++;
            }
        }
        return counter;
    }

    public static int findNumbers2(int[] nums){

        int count = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                count++;
            }
        }
        return count;

    }

    public static int findNumbers3(int[] nums){

        return (int) Arrays.stream(nums).filter(num -> String.valueOf(num).length() % 2 == 0).count();

    }

    public static int findNumbers4(int[] nums){

        int count = 0;
        for(int i: nums){
            int size = 0;
            while(i>0){
                i /= 10;
                size++;
            }
            if(size % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
