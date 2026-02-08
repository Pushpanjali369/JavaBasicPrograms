
import java.util.Scanner;

public class basicArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array element:");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the element of array: ");
        for(int i=0; i<n;i++){
            arr[i] = input.nextInt();
        }
        //print negative value....
        for(int i=0; i<n; i++) {
            if(arr[i]<0)  System.out.print(arr[i]+" ");
        }
    
    }
}
