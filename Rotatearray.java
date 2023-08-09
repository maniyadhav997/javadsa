import java.util.Scanner;
import java.io.*;
import java.util.*;
public class Rotatearray {
    static int[] rotate(int[] arr,int k)
    {
        int n=arr.length;
        k%=n;
        int[] ans=new int[n];
        int j=0;/*for insert in arr[] */
        for(int i=n-k;i<n;i++)
        {
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++)
        {
            ans[j++]=arr[i];
        }
        return ans;
    }
    static void printarra(int[] arr){
    System.out.println("array elements are");
    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]);
    }
   }
   public static void main(String[]args)
   {
            System.out.println("enter size:");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr=new int[n];
           /*  System.out.println("enter k element:");
            int k=sc.nextInt();*/
            System.out.println("enter elements:");
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println("enter k element:");
            int k=sc.nextInt();
            printarra(arr);
           // rotate(arr, k);
            int[] rotet=rotate(arr, k);
            printarra(rotet);
        
    }
    
}
