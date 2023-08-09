import java.io.*;
import java.util.*;
import java.lang.*;
public class Main{
public static int count(String s){
int count=0;
for(int i=0;i<str.length();i++){
char c=s.charAt(i);
if(c=="a|"|c=="i"||c=="e"||c=="o"||c=="u"){
count++;
}
}
return count;
}
public static void main(String[]args){
System.out.println(“enter string”);
Scanner sc=new Scanner(System.in);
String s=nextLine();
System.out.println(count(s));
}
}



}