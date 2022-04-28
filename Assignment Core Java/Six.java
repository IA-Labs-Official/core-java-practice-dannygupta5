import java.util.Scanner;

public class Six {

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
       
        if (num > 0) {
            System.out.println("The number is positive.");
        }
        
        else if (num < 0) {
            System.out.println("The number is negative.");
        }
       
        else {
            System.out.println("The number is zero.");
        }
    }
}
