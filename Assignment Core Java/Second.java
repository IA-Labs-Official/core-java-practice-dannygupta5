import java.util.Scanner;

public class Second {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble(); 

        if((a>0 && a<1) && (b>0 && b<1))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
