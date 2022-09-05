//package Array;

class DeleteElement {
    public static int delete(int a[], int key){
        int i=0;
        int n=a.length;
        for(; i<n; i++){
            if(a[i]==key){
                break;
            }
        }
        if(i==n){
            return n;
        }
        for(int j=0; j<n; j++){
            a[j]=a[j+1];
        }

        return n-1;
    }


    public static void main(String[] args){
        int a[]={1,2,3,4,5,6};
        int key=3;

        delete(a, key);

        for(int e:a){
            System.out.println(e+"");
        }
    }
    
}
