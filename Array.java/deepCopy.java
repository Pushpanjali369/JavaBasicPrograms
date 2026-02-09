
import java.util.Arrays;

public class deepCopy {
    public static void main(String[] args) {
        int[] arr = {10,45,37,87,90};
        int[] y = Arrays.copyOf(arr, arr.length);
        y[0] = 100;
        System.out.println(arr[0]);
        System.out.println(y[0]);
        
    }
}