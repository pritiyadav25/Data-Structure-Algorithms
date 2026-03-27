import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(20);
        arr.add(30);
        arr.add(10);
        arr.add(50);
        arr.add(90);

        System.out.println(arr.get(3));
        arr.remove(arr.size() - 1);
        System.out.println(arr);
        arr.set(1, 100);
        System.out.println(arr);

        for(int ele: arr){
            System.out.print(ele + " ");
        }

    }
}