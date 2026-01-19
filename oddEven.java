// check number is odd and even...
import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = input.nextInt();
        if(n%2==0){
            System.out.println("number is Evan");
        }else{
            System.out.println("number is Odd");
        }
    }
}
