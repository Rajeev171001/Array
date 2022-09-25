public class Intersection {
    static void IntersectionofTwoSortedArrays(int a[], int b[]){
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            if(i>0 && a[i]==a[i-1]){
                i++;
                continue;
            }
            if(a[i]==b[j]){
                System.out.print(a[i]+" ");
                i++;
                j++;
            }else if(a[i]>b[j]){
                j++;
            }else if(a[i]<b[j]){
                i++;
            }
        }
    }

    public static void main(String[] args){
        int a[]={1,2,4,7,7,8};
        int b[]={2,5,6,7,7,9};
        IntersectionofTwoSortedArrays(a,b);
    }
    
}
