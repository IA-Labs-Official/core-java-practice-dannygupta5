import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Third {
    
    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = Sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("enter Kth position");
         
        int k = Sc.nextInt();
        Arrays.sort(arr);
    
        for(int i = arr.length-1; i>k; i--)
        {
            System.out.println(arr[i]);
        }

        
  }
}
