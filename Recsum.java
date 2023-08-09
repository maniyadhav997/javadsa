import java.io.*;
import java.util.*;
public class Recsum{
    static int sum(int n)
    {
        if(n==0){
            return n;
        }
        return sum(n/10)+n%10;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n));
        sc.close();

    }
}