import java.util.Scanner;
// AP sries 2,5,8,11......upto 'n'
public class APseriesUpto_n {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number: ");
        int n = input.nextInt();

        for(int i=2; i<=(3*n-1);i+=3){
            System.out.println(i);
        }

    }
}
    
