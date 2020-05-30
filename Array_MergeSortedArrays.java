import java.util.Arrays;

public class Array_MergeSortedArrays {

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {

        int k = m-1;
        int l = n-1;
        int o = m+n-1;

        while(k>=0 && l>=0){

            if(nums1[k] > nums2[l]){
                nums1[o--] = nums1[k--];
            }else{
                nums1[o--] = nums2[l--];
            }

        }
        while(l>=0){
            nums1[o--] = nums2[l--];
        }

        return nums1;

    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};             //examples
        int n = 3;

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

        System.out.println("Merged: " + Arrays.toString(merge(nums1, m, nums2, n)));


    }
}
