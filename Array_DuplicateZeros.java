import java.util.Arrays;

public class Array_DuplicateZeros {

    public static int[] duplicateZeros(int[] arr) {
        int countZero = 0;
        for (int value : arr) {
            if (value == 0) countZero++;
        }
        int len = arr.length + countZero;

        for (int i = arr.length - 1, j = len - 1; i < j; i--, j--) {
            if (arr[i] == 0) {
                if (j < arr.length) arr[j] = arr[i];
                j--;
                if (j < arr.length) arr[j] = arr[i];
            } else {
                if (j < arr.length) arr[j] = arr[i];
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};       // example

        System.out.println("Original        : " + Arrays.toString(arr));
        System.out.println("Zeros duplicated: " + Arrays.toString(duplicateZeros(arr)));

    }
}
