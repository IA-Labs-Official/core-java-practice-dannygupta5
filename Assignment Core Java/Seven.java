import java.util.Scanner;



public class Seven {
    
    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int c = Sc.nextInt();

        if(a>b && a>c)
        {
            System.out.println("Maximum is out of three  " + a);
        }
        else if(b>a && b>c)
        {
            System.out.println("Maximum is out of three  " + b);
        }
        else
        {
            System.out.println("Maximum is out of three  " + c);
        }
    }
}
