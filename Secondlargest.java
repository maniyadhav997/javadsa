import java.util.*;
import java.io.*;
public class Secondlargest 
{
    public static void main(String[]args)
    {
        int[] arr=new int[5];
        System.out.println("enter the size");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("second "+secondmax(arr));
    }
        static int maxs(int[] arr)
        {
            int max=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]>max)
                {
                    max=arr[i];
                }
            }
            return max; 
        }
        static int secondmax(int[] arr)
        {
            int max=maxs(arr);
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==max)
                arr[i]=Integer.MIN_VALUE;
            }
            int sec=maxs(arr);
            return sec;
        }

    
}

        
    
        
    

    

