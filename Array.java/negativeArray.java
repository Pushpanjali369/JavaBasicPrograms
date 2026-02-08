
import java.util.Scanner;

public class negativeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = input.nextInt();

        // arrays input
        int[] arr = new int[n];
        System.out.println("Enter the element of array:");
        for(int i=0; i<n;i++){
           arr[i] = input.nextInt();
        }

        for (int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
    }
}
