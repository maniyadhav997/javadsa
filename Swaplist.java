import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Swaplist {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr size");
        int n=sc.nextInt();
        System.out.println("enter elemnts");
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<n;i++){
            li.add(sc.nextInt());
        }
        System.out.println("enter indexes to be swapped");
        int x=sc.nextInt();
        int y=sc.nextInt();
        Collections.swap(li, x, y);
        for(int i=0;i<li.size();i++){
            System.out.print(li.get(i)+" ");
        }
        
    }
    
}
