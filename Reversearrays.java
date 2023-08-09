import java.io.*;
import java.util.*;
public class Reversearrays
{
    /*static void swap(int[] arr,int i,int j)
    {
        int tem=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }*/
    static void revers(int[] arr)
    {
        int i=0;
        int j=arr.length-1;
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
        printarra(arr);
    }
    static void printarra(int[] arr)
 {
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
        System.out.println("enter elements:");
        for(int i=0;i<n;i++)
        {
            if(i==n)
            {
                sc.close();
                break;
            }
            arr[i]=sc.nextInt();
            
        }
        printarra(arr);
    revers(arr);
    printarra(arr);
    }
}

