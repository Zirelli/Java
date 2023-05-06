import java.util.Arrays;

public class Array {
    public static void main (String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arrDest = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.arraycopy(arr, 0, arrDest, 0, arr.length);
        System.out.println(Arrays.toString(arrDest));
        }
    }
