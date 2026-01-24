import java.util.Scanner;

public class GCD {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number: ");
        int num1 = input.nextInt();
        System.out.print("please enter your number: ");
        int num2 = input.nextInt();
        int lcm = lcm(num1,num2);
        System.out.println("the LCM of two number is : "+lcm);
    }

        public static int lcm(int first , int second){
            int gcd = 1;
            int i = 2;
            int least = least(first,second);
            while(i <= least){
                if(first % i == 0 && second%i==0){
                    gcd = i;
            }
                i++;
         }
            return gcd;
        }

        public static int least(int num1, int num2){
            if(num1< num2){
                return num1;
        } else {
            return num2;
        }
    }
    
}
