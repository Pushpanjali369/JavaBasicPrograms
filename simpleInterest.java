// calculat simple intrest...
import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principle: ");
        float p = input.nextFloat();
        System.out.print("Enter the rate of intrest: ");
        float r = input.nextFloat();
        System.out.print("Enter the time: ");
        float t = input.nextFloat();
        float SI = (p*r*t)/100;
        System.out.println("The simple intrest is:"+SI);
        
    }
}
