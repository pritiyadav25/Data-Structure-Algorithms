public class operationinarry {
    public static void main(String[] args) {
        int arr[]= {1,9,4,5,3,7};
       
        for(int i=0;i<arr.length;i++){
             System.out.print( arr[i] + "   " );
            if(i%2==0){
                arr[i]=arr[i] +10;

            }
            else{
                arr[i]=arr[i]*2;
            }
        }
        System.out.print("      ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
       
    }
    
}
