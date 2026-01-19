// calculate the total surface area of cuboid
import java.util.Scanner;

public class TSAofCuboid {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the lenght of cuboid:");
         float l = input.nextFloat();
         System.out.print("Enter the width of cuboid:");
         float b= input.nextFloat();
         System.out.print("Enter the height of cuboid:");
         float h = input.nextFloat();
         float TSA = 2*(l*b+b*h+l*h);
         System.out.println("The total surface area of cuboid:"+TSA);
     }
}
