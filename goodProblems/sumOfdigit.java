import java.util.Scanner;

public class sumOfdigit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number: ");
        int num = input.nextInt();

        int sum = sumOfDigits(num);
        System.out.println("The sum of digit ="+sum);

    }

    public static int sumOfDigits(int num){
        int sum = 0;
        while(num > 0){
            sum +=num % 10;
            num /= 10;
        }
        return sum;
    }

}
