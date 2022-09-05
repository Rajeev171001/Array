// package Array;    
    class LinearSearch{
        public static void main(String[] args){
            int a[]={1,2,3,4,5,6};
            int key=3;
            int res=-1;
            for(int i=0;i<a.length;i++){
                if(i==key){
                    res=i;
                    break;
                }
            }
            if(res==-1){
                System.out.println("not found");
            }else{
                System.out.println("key found at"+ res);
            }
        }
    }