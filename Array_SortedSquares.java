import java.util.Arrays;

public class Array_SortedSquares {

    public static void main(String[] args) {

        int[] A = {-7, -4, -3, -1, 0, 2, 3, 10,11};     //aufgabenstellung: 10000, hier beispielhaft

        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(sortedSquares(A)));

    }

    public static int[] sortedSquares(int[] A){

        int n = A.length;
        int[] res = new int[n];
        int j = 0, k = n-1;

        for (int i=n-1; i>=0; i--){

            if(Math.abs(A[j]) > Math.abs(A[k])){
                res[i]= A[j]*A[j];
                j++;
            }else{
                res[i]= A[k]*A[k];
                k--;
            }


        }return res;

    }
}
