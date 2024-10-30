import java.util.ArrayList;
import java.util.Collections;

public class InsertionSort implements SortingAlgorithm {

    public long sort(ArrayList<Integer> vector) {
        long start = System.nanoTime();
        for (int i = 1; i < vector.size(); i++) {
            int current = i;
            int j = i-1;
            while (j >= 0) {
                if (vector.get(current)< vector.get(current-1)) {
                    Collections.swap(vector, current, current-1);
                    current--;
                    j--;
                }
                j--;
            }
        }
        long end = System.nanoTime();
        return end - start;

    }

}
