import java.util.Scanner;

public class floatingPointNumb{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st float number:");
        float num1 = input.nextFloat();
        System.out.print("Enter the 2nd float number:");
        float num2 = input.nextFloat();
        float product = num1*num2;
        System.out.print("the product of two floating point number is:"+product);

        
    }


}