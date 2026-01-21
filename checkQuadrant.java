// check quadrant og given point 1st quadrant, 2nd qua. 3rd qua, 4th qua, origin or x,y axis..
import java.util.Scanner;

public class checkQuadrant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number which lies on x-axis : ");
        int x = input.nextInt();

        System.out.println("Enter the number which lies on y-axis : ");
        int y = input.nextInt();
        if(x==0 && y==0){
            System.out.println("Origin..");
        }
        else if(x>0&&y>0){
            System.out.println("1st quadrant..");
        } else if(x<0&&y>0){
            System.out.println("2nd quadrant..");
        } else if(x<0&&y<0){
            System.out.println("3rd quadrant..");
        } else if(x>0&&y<0){
            System.out.println("4th quadrant..");
        } else if(x==0){
            System.out.println("on y-axis..");

        }else System.out.println("on x-axis");

     
    }
}
