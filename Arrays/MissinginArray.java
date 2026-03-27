public class MissinginArray {
     int missingnum(int arr[]){
        long n= arr.length+1;
        long sum = n*(n+1)/2;
         long arraysum= 0;
         for(int i:arr){
            arraysum +=i;

         }
         return  (int)(sum-arraysum);
    }
    public static void main(String[] args) {
        int arr[]= {1,6,4,2,3};
        MissinginArray obj = new MissinginArray();
        int missing = obj.missingnum(arr);
        System.out.println("the missing element is :"+ missing);


    }
    

    
}
