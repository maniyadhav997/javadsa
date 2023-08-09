import java.util.*;
import java.io.*;
public class Sumofseries {
    public  static void main(String[] args) {
        int ans=0;
        System.out.println("enter the nSystem ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            if(i%2==0){
                ans-=i;
            }
            else{
                ans+=i;
            }
        }
        System.out.println(ans);
        
    }
        
    }
    

