import java.util.Scanner;

public class Four {
    
    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int sum = 0;
        
        if(a<1000 && a>0)
        {
        while(a!=0)
        {
           int r = a%10;
           a = a/10;
           sum = sum + r;
        }
        System.out.println("Sum of all Digits" + sum);
        }
        else
        {
            System.out.println("Invalid NUmber");
        }
        Sc.close();
    }
}
