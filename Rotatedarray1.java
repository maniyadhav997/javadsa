public class Rotatedarray1 {
    static int arrayr(int[] a){
        int n=a.length;
        int start=0,end=a.length-1,ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(a[mid]<=a[end]){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
    return ans;
    }
    public static void main(String[]args){
        int[] a={4,5,6,1,2,3};
        System.out.println(arrayr(a));
    }
}
