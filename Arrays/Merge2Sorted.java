public class Merge2Sorted {

    public static void mergesort(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
            if (i == a.length) {
                while (j < b.length) {
                    c[k++] = b[j];

                }

            } else {
                c[k++] = a[i++];
            }

        }
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        int arr2[] ={1,2,3,4,5};

        int arr3[]= new  int[arr.length + arr2.length];

        mergesort(arr, arr2, arr3);
         for(int ele : arr3){
            System.out.print(ele + " ");
         }
        
    }




}