import java.util.Scanner;

public class leastNumber {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int num1 = input.nextInt();
        System.out.println("Enter the 1st number:");
        int num2 = input.nextInt();
        System.out.println("Enter the 1st number:");
        int num3 = input.nextInt();

        if(num1<num2&&num1<num3){
            System.out.println("The laest number is :"+num1);
        }else if (num2<num3&&num2<num1){
            System.out.println("The laest number is :"+num2);
        }else{
            System.out.println("The laest number is :"+num3);
        }

    }
}
