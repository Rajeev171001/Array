public class SuminsortedArray {
    static boolean twoNumberSum(int a[], int sum){
        int l=0;
        int r=a.length-1;
        while(l<r){
            int cursum=a[l]+a[r];
            if(cursum>sum){
                r--;
            }if(cursum<sum){
                l++;
            }else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int a[]={1,7,8,10,12};
        int sum=3;
        System.out.println(twoNumberSum(a,sum));
    }
    
}
