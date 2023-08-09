import java.util.Scanner;

public class lastindex {
    static int las(int[] a,int x,int i,int lasi){
        if(i==a.length){
            return 0;
        }
        if(a[i]==x){
            if(lasti<i){
                lasti=i;
                return i;
            }
    
            return las(a,x,i:i+1,lasi);
        }
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        int las=-1;
        System.out.println(las(a,5,0,las));
    }
    
}
