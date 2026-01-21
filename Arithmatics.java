
import java.util.Scanner;

public class Arithmatics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to arithmatic calculator:");
        System.out.print("Enter the first value:");
        int first = input.nextInt();
        System.out.print("Enter the second value:");
        int second = input.nextInt();

        int add = first + second;
        int sub = first - second;
        int mul = first * second;
        float div = first / second;
        int mod = first % second;

        System.out.println("Addintion = "+ add);
        System.out.println("Subtraction = "+ sub);
        System.out.println("multiplication = "+ mul);
        System.out.println("division = "+ div);
        System.out.println("remender = "+ mod);



    }
}
