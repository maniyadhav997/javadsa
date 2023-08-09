import java.io.*;
import java.util.*;
public class Union{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n and m value");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[m];
       // int[5] c=new int[5];
        System.out.println("enter elments");
       // Scanner sc= new Scanner(System.in);
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
            boolean check=false;
            for(int j=0;j<m;j++){
                if(b[i]==a[j]){
                   check=true;
                    break;
                }
            }
            if(!check){
                System.out.println(b[i]);
            }
            else{
                System.out.println("sorry");
            }
        }


    }
}