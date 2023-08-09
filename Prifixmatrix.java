import java.util.Scanner;

public class Prifixmatrix {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
       System.out.println("enter m");
        int m=sc.nextInt();
        int[][] a=new int[n][m];
      System.out.println("enter values");
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++)
        {
            a[i][j]=sc.nextInt();
        }
    }
        System.out.println("prifix matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(j>0){
                    a[i][j]+=a[i][j-1];
                }
                if(i>0)
                {
                    a[i][j]+=a[i-1][j];
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]+"   ");
            }
            System.out.println(" ");
        }
      }
    }
