import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        SortingAlgorithm insertionSort = new InsertionSort();
        ArrayList<Integer> vector = new ArrayList<>();
        vector.add(0);
        vector.add(3);
        vector.add(2);
        vector.add(4);
        vector.add(2);
        vector.add(4);
        System.out.println(vector);
        insertionSort.sort(vector);
        System.out.println(vector);
    }
}