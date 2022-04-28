import java.util.Scanner;

public class Fifth {
    
    public static void main(String[] args) {
       
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();

        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int dis = Math.abs(a - b);
        int max = 0;
        int min;
        if(a>b)
        {
            max = a;
            min = b;
        }
        else
        {
            max = b;
            min = a;
        }
        System.out.println("Addition of Two Integers  " + add);
        System.out.println("Subtraction of Two Integers  " + sub);
        System.out.println("Multiplication of Two Integers  " + mul);
        System.out.println("Division of Two Integers  " + div);
        System.out.println("Distance of Two Integers   " + dis);
        System.out.println("Maximum of Two Integers   " + max);
        System.out.println("Minimum of Two Integers  " + min);




    }
}