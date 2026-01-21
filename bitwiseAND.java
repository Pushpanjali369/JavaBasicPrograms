import java.util.Scanner;

public class bitwiseAND {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("this is show bitwise AND operator");
        System.out.print("Enter the 1st number:");    
        int num1 = input.nextInt();
        System.out.print("Enter the 2nd number:"); 
        int num2 = input.nextInt();
        int result = num1 & num2;
        System.out.println("result is = "+result);

         

    }
}
