import java.util.*;
import java.io.*;
public class Sorting1 {
    static void printarra(int[] arr)
    {
    System.out.println("array elements are");
    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]);
    }
    }
    static void swap(int[] arr,int i,int j)
    {
        while(i<j)
        {
           /*  swap(arr,i,j);
            i++;
            j--;*/
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
  /*   static void swapar(int[] arr,int n,int i,int j)
    {
      for( i=0,j=n-1;i<j;i++,j--)
      {
        if(arr[i]>arr[j])
        {
            swap(arr,i,j);
        }
      }
      printarra(arr);
    }*/
    public static void main(String[]args)
    {
        System.out.println("enter size:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        printarra(arr);
        swap(arr);
        printarra(arr);
    }
   
    
}
