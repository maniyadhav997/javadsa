import java.util.*;
public class ReFibonocic{
    static int fibo(int n){
        if(n==0||n==1)
        {
           // System.out.println(n);
            return n;
        }
        return fibo(n-1)+fibo(n-2);
       // System.out.println(n);
    }
    public static void main(String[]args)
    {
        System.out.println("enter n value");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       // fibo(n);
        System.out.println(fibo(n));
        sc.close();

    }
}