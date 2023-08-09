import java.util.*;
public class Even {
    static void printarra(int[] arr)
    {
    System.out.println("array elements are");
    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]);
    }
    }
    /*  static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    */
    static int[] sortarray(int[] a)
    {
        int i=0,j=a.length-1;
        while(i<j)
        {
            if(a[i]%2==1&&a[j]==0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            i++;
            j--;
            }
            if(a[i]%2==0){
                i++;
            }
            if(a[j]%2==1){
                j--;
            }
        }
        printarra(a);
        return a;
    }
    public static void main(String[]args)
    {
        System.out.println("enter size:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        printarra(a);
        int[] ans=sortarray(a);
        for(int i: ans)
        {
            System.out.println(i+" ");
        }
       printarra(ans);
       sc.close();
    }   
}
