public class Rotatedarry2{
    static int findpivot(int[] a,int target){
        int st=0,end=a.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(target==a[mid]){
                return mid;
            }
            else if(a[mid]<a[end]){
                if(target>a[mid]&&target<=a[end]){
                    st=mid+1;
                }
                else
                end=mid-1;
            }
            else{
                if(target>a[st]&&target<a[mid]){
                    end=mid-1;
                }
                else
                st=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int[] a={4,7,8,1,2};
        System.out.println(findpivot(a, 2));
    }
}