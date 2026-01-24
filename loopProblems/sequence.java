import java.util.Scanner;

public class sequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number: ");
        int n = input.nextInt();

        int i = 1;
        int j = n;

        while (i<=j){
            System.out.print(i);
            if(i != j){
               System.out.print(j); 
            }
            i++;
            j--;
        }
        i--;
        j++;
        while(i>=1){
            System.out.print(i);
            if(i!=j)
                System.out.print(j);
                i--;
                j++;
            
        }
        


    
    }
}
