import java.util.*;
import java.io.*;
public class Uniquearray {
    public static void main(String[]args)  {
        int[] arr=new int[50];
         int a=-1;
        System.out.println("enetr size");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enetr elments");
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt(); 
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[i]=-1;
                    arr[j]=-1;
                
                }


            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                a=arr[i];
            }
        }
        System.out.println(a);

    
        
    }
    
}
