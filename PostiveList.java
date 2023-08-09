import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class PostiveList{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the length of the array: ");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter the elements of array: ");
for(int i = 0; i < n; i++){
arr[i] = sc.nextInt();
}
ArrayList<Integer> al = new ArrayList<>();
for(int i = 0; i < n; i++){
if(arr[i] >= 0){
al.add(arr[i]);
}
}
if(al.size() == 0){
System.out.println("NA");
return;
}
for(int i = 0; i < al.size(); i++){
System.out.print(al.get(i) + " ");
}
}
}