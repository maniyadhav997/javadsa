import java.util.*;
import java.io.*;
public class Rectanglepattern {
    public static void main(String[]args) {
        System.out.println("enter the n value");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i= 0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println("");

        }
        
    }
    
}
