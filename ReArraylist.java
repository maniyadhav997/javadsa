import java.util.ArrayList;
import java.util.Scanner;
public class ReArraylist {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        ArrayList<Integer> li=new ArrayList<>();
        System.out.println("enter elemts");
        for(int i=0;i<n;i++){
            li.add(sc.nextInt());
        }
        li.remove(2);
        for(int i=0;i<li.size();i++){
            System.out.print(li.get(i)+" ");
        }

    
}
}