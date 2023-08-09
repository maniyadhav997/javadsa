import java.io.*;
import java.util.*;
public class Naturalrec{
    static void printin(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printin(n-1);
        System.out.println(n);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printin(n);
    }
}