// print abosolute value of integers...
import java.util.Scanner;

public class absoluteValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any integer value:");
        int n = input.nextInt();
        if(n==0 || n>0){
            System.out.println("the value is absolute");
        }
        if(n<0){
            n = (-n);
            System.out.print("The Aboslute value:"+n);

        }
    }
}
