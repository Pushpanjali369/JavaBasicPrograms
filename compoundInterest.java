import java.util.Scanner;

public class compoundInterest {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principle amount in RS : ");
        float p = input.nextFloat();
        System.out.print("Enter the rate of intrest: ");
        float r = input.nextFloat();
        System.out.print("Enter the how many year you borrowing this: ");
        float t = input.nextFloat();
        double CI = p * Math.pow((1+r/100),t);
        System.out.println("The compound intrest is RS:"+CI);
        
    }
}
