import java.io.*;
import java.util.*;
import java.lang.Math;
public class Armstrong
{
    public static void main(String[]args)
    {
        System.out.println("enter");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
      //  int count=0;
        while(num<=n)
        {
            int count=0;
            int i=n;
            while(i>0)
            {
                count++;
                i/=10;
            }
            int value=num;
            int sum=0;
            while(value>0)
            {
                int digi=value%10;
                sum+=Math.pow(digi,count);
               /*  if(sum==n){
                    System.out.println(sum);*/
                    value/=10;
                    if(sum>value){
                        continue;
                    }
                }
                if(sum==n){
                    System.out.println(sum);
            }
        }
    }
}