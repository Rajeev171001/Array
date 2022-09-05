public class Rotate {
    static void RotateMatrix(int a[][]){
        int n=a.length;
        TransposeOfMatrix(a);

        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int swp=a[i][j];
                a[i][j]=a[i][n-j-1];
                a[i][n-j-1]=swp;
            }
        }

    }


    static void TransposeOfMatrix(int a[][]){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int swap=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=swap;
            }
        }
        
    }

    static void print(int a[][]){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j] +"");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int a[][]={
            {1,2,3,4},
            {5,6,7,8},
            {12,34,56,78},
            {23,45,67,89}
        };

        print(a);
        RotateMatrix(a);
        print(a);
    }
    
}
