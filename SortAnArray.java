import java.util.ArrayList;

public class RecursiveSort {

    static void insert(ArrayList<Integer> arr, int temp) {
        if (arr.size() == 0 || arr.get(arr.size() - 1) <= temp) {
            arr.add(temp);
            return;
        }
        int v = arr.get(arr.size() - 1);
        arr.remove(arr.size() - 1);
        insert(arr, temp);
        arr.add(v);
    }

    static void sort(ArrayList<Integer> arr) {
        if (arr.size() == 1) {
            return;
        }
        int temp = arr.get(arr.size() - 1);
        arr.remove(arr.size() - 1);
        sort(arr);
        insert(arr, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(347384);
        arr.add(5);
        arr.add(234);
        arr.add(0);
        sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
