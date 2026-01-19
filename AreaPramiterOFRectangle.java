// WAP to find wheather the area of rectangle is greater than its parimeter...
import java.util.Scanner;

public class AreaPramiterOFRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of ractangle: ");
        float l = input.nextFloat();      //lenght
        System.out.print("Enter the width of rectangle: ");
        float b = input.nextFloat();   //width
        float P = 2*(l+b);
        float A = l*b;
        System.out.println("Area : "+A);
        System.out.println("peremiter: "+P);
        if(A>P){
            System.out.println("Area is grether than peremiter....");
        }
        else{
            System.out.println("Not Greater...");
        }
    }
}
