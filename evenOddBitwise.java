import java.util.Scanner;

public class evenOddBitwise {
                 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the any number: ");
        int number = input.nextInt();
        if((number & 1) == 0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
}
