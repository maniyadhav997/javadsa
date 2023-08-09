public class ClassTest{
    public static String check(int n1,int n2,int n3){
        if(n1<n2&&n2<n3){
            String str="increasing order";
            return str;
        }
        else if(n1>n2&&n2>n3){
            String str="decreasing order";
            return str;
        }
        else{
            String str="nither increase nor decrease";
            return str;
        }
    }
    public static void main(String[]args){
        System.out.println(check(Integer.parseInt(args[1]),Integer.parseInt(args[2]),Integer.parseInt(args[3])));
    }
}