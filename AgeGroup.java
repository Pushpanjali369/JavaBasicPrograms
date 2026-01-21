// Create a program that categories a  person into different age groups...
import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the age of person");
        int age = input.nextInt();
        if(age>=60){
            System.out.println("Senior");
        } else if(age<60 && age>20){
            System.out.println("Adult");
        } else if(age<20 && age>13){
            System.out.println("Teen");
        }else{
            System.out.println("Child");
        }
    }
}
