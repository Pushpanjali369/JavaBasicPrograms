

import java.util.Scanner;

public class patternProblem {
        public static void main(String[] args) {
            System.out.print("Enter the number of rows:");
            try (Scanner input = new Scanner(System.in)) {
                int n = input.nextInt();
                // right trangle

                // for(int i=1; i<=n; i++){
                //     for(int j=1; j<=i; j++){
                //         System.out.print("*");
                //     }
                //     System.out.println();
                // }

                // reverse right trangle
                // for(int i=1; i<=n; i++){
                //     for(int j=1; j<=n+1-i; j++){
                //         System.out.print("*");
                //     }
                //     System.out.println();
                // }

                for(int i=1; i<=n; i++){
                    // it is for number of spaces
                    for(int j=1; j<=n-i; j++){
                        System.out.print(" ");
                    }
                    // it is for star trangle
                    for(int k=1; k<=i; k++){
                        System.out.print("*");

                    }
                    System.out.println();
                }
            }

        }
    }
    

