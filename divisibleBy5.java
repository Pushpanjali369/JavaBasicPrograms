
import java.util.Scanner;

public class divisibleBy5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number:");
        int n = input.nextInt();
        if(n%5==0){
            System.out.println("number is divisible by 5.");
        }else{
            System.out.println("not divisible by 5.");
        }
    }
}
