import java.util.*;
import java.io.*;
public class Sumofdigits {
    
    public static void main(String[]args)
    {
        int sum=0;
        System.out.println("enter n value");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0)
        {
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        System.out.println(sum);

    }
}
