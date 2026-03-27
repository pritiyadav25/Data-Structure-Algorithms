public class RotateArray {
    public static void rotatearr(int arr[], int d) {
        int n = arr.length;
        d = d % n;
        reverse(arr, 0, d - 1);
        reverse(arr, 0, n - 1);
        reverse(arr, 0, n - 1);

    }

    static void reverse(int arr[], int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
    }

    static void printarry(int arr[]) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 3, 1, 5, 6, 78 };
        int d = 3;

        System.out.println("before rotation");
        printarry(arr);

        rotatearr(arr, d);
        System.out.println("after rotation");
        printarry(arr);

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

    }

}
