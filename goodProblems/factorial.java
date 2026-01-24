import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number: ");
        int num = input.nextInt();

        int fact = factorial(num);
        System.out.println("factorial of number is:" + fact);


    }

        public static int factorial(int num){
        if(num==0&& num==1){
            return 1;
        }
        int fact = 1;
        int i = 2;
            while(i <= num){
            fact *=i;
            i++;
    }
        return fact;
    }
}
    

