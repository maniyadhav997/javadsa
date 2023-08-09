import java.util.Scanner;

public class Lasindex2 {
    static int las(int[] a,int n,int i,int x,int lasi){
        if(i==a.length){
            return lasi;
        }
        if(a[i]==x){
            if(lasi<i){
                lasi=i;
            }
            int ans= las(a,n,i+1,x,lasi);
            return ans;
        }
        else{
        int ans= las(a,n,i+1,x,lasi);
            return ans;
        }
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        System.out.println("enter 5 elements");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter repeating element");
        int x=sc.nextInt();
        int las=-1;
        System.out.println(las(a,5,0,x,las));
    }
    
}

