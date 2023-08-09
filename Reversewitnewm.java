import java.util.Scanner;

public class Reversewitnewm 
{
    static void printarra(int[] arr)
    {
    System.out.println("array elements are");
    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]);
    }
    }
    static int[] revsarray(int[] arr)
    {
        int n=arr.length;
        int j=0;
        int[] ans=new int[n];
        for(int i =n-1;i>=0;i--)
        {
            //for(int j=0;j<n;j++)
            //{
                ans[j++]=arr[i];
          //  }
        }
        printarra(ans);
        return ans;
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
            arr[i]=sc.nextInt();
        }
        printarra(arr);
        int ans[]=revsarray(arr);
        printarra(ans);


    }
    
}
