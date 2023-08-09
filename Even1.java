import java.util.*;
import java.io.*;
public class Even1{

 public static int[] sortArrayByParity(int[] a) {

 int i = 0, j = a.length-1;

 while(i < j) {

 if(a[i] % 2 == 1 && a[j] % 2 == 0) {

 
 int temp=a[i];

 a[i]=a[j];

 a[j]=temp;

 i++;

 j--;

 }
if(a[i] % 2 == 0) 
i++;

 if(a[j] % 2 == 1)
  j--;

 }

 return a;

 }

 public static void main(String[] args){

 int[] a={1,2,3,4,5};

 int[] ans=sortArrayByParity(a);

 for (int element: ans) {

 System.out.print(element + " ");

 }

}
}
