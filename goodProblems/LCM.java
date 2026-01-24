import java.util.Scanner;

public class LCM {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number: ");
        int num1 = input.nextInt();
        System.out.print("please enter your number: ");
        int num2 = input.nextInt();
        int lcm = lcm(num1,num2);
        System.out.println("the LCM of two number is : "+lcm);

}
    public static int lcm(int first , int second){
        int i = 1;
        while(i <= second){
            int factor = first * i;
            if(factor % second == 0){
              return factor;  
            }
            i++;
        }
        return 0;
    }

    
}
