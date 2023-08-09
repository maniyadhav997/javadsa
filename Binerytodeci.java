import java.util.*;
import java.io.*;
public class Binerytodeci {
    public static void main(String[]args) {
        int ans=0,pw=1;
        System.out.println("enter binery");
        Scanner sc=new Scanner(System.in);
        int bin=sc.nextInt();
        while(bin>0)
        {
            int unit=bin%10;
            ans+=unit*pw;
            bin/=10;
            pw*=2;

        }
        System.out.println(ans);
        
    }
    
}
