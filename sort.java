import java.util.Scanner;
import java.util.*;
public class sort {
    public static void main(String[]args)
    {
        int[] arr=new int[5];
        System.out.println("enter 5 elements");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
           arr[i]=sc.nextInt();
        }
        System.out.println("elemets:");
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("after:");
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
    
}
