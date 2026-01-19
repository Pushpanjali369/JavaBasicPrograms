
import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Actual(cost) price  : ");
        float CP = input.nextFloat();

        System.out.print("Enter the selling price: ");
        float SP = input.nextFloat();

        if(CP>SP){
            System.out.println("loss : "+(CP-SP)+"₹");
        }
        else if(SP>CP){
            System.out.println("Profit: "+(SP-CP)+"₹");
        } else{
            System.out.println("No profit No loss...");
        }
        
    }
}

