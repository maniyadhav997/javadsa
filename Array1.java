import java.util.*;
import java.io.*;
public class Array1 {
    public static void main(String[]args)  {
        int[] arr=new int[5];
        System.out.println("enter no.of");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i:arr){
            System.out.println(i);
        }
        
    }
    
}
