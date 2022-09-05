// package Array;

public class LargestElement {
    public static int maxOf(int a[]){
        if(a.length==0){
            return-1;
        }
        int maxIndex=0;
        for(int i=0;i<a.length-1;i++){
            if(maxIndex<a[i]){
                maxIndex=a[i];
            }
        }
        return maxIndex;

    }
    public static void main(String[] args){
        int a[]={1,3,5,7,8};
        int index=maxOf(a);
        System.out.println(a[index]);
    }
    
}
