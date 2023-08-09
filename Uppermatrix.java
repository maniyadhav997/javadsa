import java.util.Scanner;

public class Uppermatrix { 
    static void upper(int[][] a,int n){
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println("enter matrix elements");
        int[][] a=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            
            }
        }
        upper(a,n);
       /*  int[][] b=upper(a);
        System.out.println("upper matrix is");
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]);
            }
            System.out.println(" ");
        }*/
    }
    
}
