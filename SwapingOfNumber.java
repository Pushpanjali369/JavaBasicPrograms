import java.util.Scanner;

public class SwapingOfNumber {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // program for swaping of two number
         System.out.print("Enter the 1st number:");    //10
         int num1 = input.nextInt();
         System.out.print("Enter the 2nd number:");  //20
         int num2 = input.nextInt();
         num1 = num1 + num2;      //10+20 = 30a
         num2 = num1 - num2;       //30-20 = 10b
         num1 = num1 - num2;    //30-10 = 20a
         System.out.print("The 1st number is:");
         System.out.println(num1);
         System.out.print("The second number is:");
         System.out.println(num2);

    }
}
