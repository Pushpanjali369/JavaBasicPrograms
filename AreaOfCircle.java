// calculate Area of circle
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of circle:");
        float radius = input.nextFloat();
        float pi = 22/7;
        float Area = (pi*radius*radius);
        System.out.print("The area of circle:"+Area);
        
    }
}
