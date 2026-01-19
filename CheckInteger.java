
import java.util.Scanner;

public class CheckInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any real number");
        float n = input.nextFloat();
        if(n%1==0){
            System.out.println("Integer");
        }else{
            System.out.println("Not integer");
        }
    }
}
