
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit: ");
        float F = input.nextFloat();        //f = fahrenheit
        float C = ((F-32)*5/9);       //C = celcius
        System.out.println("The temp in celcius is:" + C);
    }
}
