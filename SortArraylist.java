import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class SortArraylist {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        ArrayList<Integer> li=new ArrayList<>();
        System.out.println("enter elemts");
        for(int i=0;i<n;i++){
            li.add(sc.nextInt());
        }
        Collections.sort(li);
        System.out.println("sorting order is");
        for(int i=0;i<li.size();i++){
            System.out.print(li.get(i)+" ");
        }
    }
}
