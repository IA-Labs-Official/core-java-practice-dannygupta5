import java.util.Scanner;

public class First
{
    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int c = Sc.nextInt();
        int d = Sc.nextInt();

       if((a==b) && (b==c) && (c==d) )
        {
            System.out.println("Equals");
            
        }
        else
        {
           System.out.println("Not equal"); 
        }
        
    }
}