import java.util.Arrays;
public class arraysort {
    public static void main(String[] args) {
        int arr[]= {8,3,8,3,4,5,2,4,6,8};
        print(arr);
        Arrays.sort(arr);
        print(arr);
       
    }
    public static void print(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + "  ");
        }
            System.out.println();
    }

    



}