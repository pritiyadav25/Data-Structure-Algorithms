public class secondmaxelement {
    public static void main(String[] args) {
        int arr[] = {4,6,7,2,3,4,5,3};
       int  firstmax= Integer.MIN_VALUE;
       int  secondmax= Integer.MIN_VALUE;
        
       for(int i =0; i<arr.length ; i++){
        if(arr[i]>firstmax){
            firstmax= arr[i];
        }
       }
        for(int i =0; i<arr.length ; i++){
        if(arr[i]>secondmax && arr[i]!= firstmax){
            secondmax= arr[i];
        }
       }
       System.out.println("firts maximum is :"  + firstmax);
       System.out.println(" second max is :"  + secondmax);
       

    }
    
}
