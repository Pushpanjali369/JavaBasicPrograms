
import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any years:");
        int yr = input.nextInt();
        if(yr%4==0 || yr%400==0){
            System.out.print("leap year...");
        } else {
            System.out.println("Not leap year..");
        }
    }
}
