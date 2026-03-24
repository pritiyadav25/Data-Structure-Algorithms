
public class maxelement {
    
public static void main(String[] args) {
    int arr[] = {2,5,3,1,4,5,7,5};
     int max=  Integer.MIN_VALUE;
     for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max = arr[i];
        }

     }
     System.out.println("the maximum element in the array is " + max);

}
}
