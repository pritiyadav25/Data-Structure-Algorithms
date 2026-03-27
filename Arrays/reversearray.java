public class reversearray {

    public static void main(String[] args) {
        int arr[] = {3,2,4,6,9,3};
        // for(int i =arr.length-1 ; i>=0 ; i--){
        //     System.out.print(arr[i] +  "  ");
        // }
        //this is new approach 
        int i =0 , j=arr.length-1;
        while(i<=j){
            int temp=arr[i];
            arr[i] = arr[j];
            arr[j]= temp;
            i++;
            j--;

        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
       












    }





}