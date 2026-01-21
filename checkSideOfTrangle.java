import java.util.Scanner;

public class checkSideOfTrangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st side of tringle: ");
        float a = input.nextFloat();

        System.out.print("Enter the 2nd side of tringle: ");
        float b = input.nextFloat();

        System.out.print("Enter the 3rd side of tringle: ");
        float c = input.nextFloat();

        if(a+b>c && b+c>a && a+c>b){
            System.out.println("trangle is posible..");
        }else {
            System.out.println("trangle is not posible..");
        }
    }
}
