import java.util.Scanner;

public class rightShift {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("this is show bitwise AND operator");
        System.out.print("please enter the any number:");    
        int num1 = input.nextInt();
        System.out.print("enter how many position shift the number:");  
        int num2 = input.nextInt();

        int result = num1 >> num2;
        System.out.println("result is = "+result);

    }
}
