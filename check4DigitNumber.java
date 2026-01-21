// check given number is 4 digit or not..
import java.util.Scanner;

public class check4DigitNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the any integer: ");
        int n = input.nextInt();
        if(n>999&& n<10000){
            System.out.println("The given number is 4 digit number..");
        }else{
            System.out.println("Not 4digit...");
        }
    }
}
