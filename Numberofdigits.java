import java.io.*;
import java.util.*;
public class Numberofdigits {
    public static void main(String[]args)
    {
        int count=0;
        System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0)
        {
            if(n%10!=0){
             count++;
            n/=10;
            }
        }
        System.out.println(count);
    }
}
    

