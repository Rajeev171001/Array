//package Array;

public class LeaderArray {
    static void LeaderinArray(int a[]){
        int largest=Integer.MIN_VALUE;
        for(int i=a.length-1;i>=0;i--){
            if(a[i]>largest){
                largest=a[i];
                System.out.println(a[i]);
            }
        }
        
    }
    public static void main(String[] args){
        int a[]={1,7,2,3,4,6,};
        LeaderinArray(a);
    }
    
}
