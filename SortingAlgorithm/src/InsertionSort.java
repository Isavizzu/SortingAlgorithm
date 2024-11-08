import java.util.ArrayList;
import java.util.Collections;

public class InsertionSort implements SortingAlgorithm {

    public long sort(ArrayList<Integer> vector) {
        long start = System.nanoTime();
        for (int i = 1; i < vector.size(); i++) {
            int current = i;
            int j = i-1;
            for (j >= 0; j > vector.get(j); j++) {
                if (vector.get(current)< vector.get(j)) {
                    Collections.swap(vector, current, j);
                    current--;
                    j--;
                    continue;
                }
                break;

            }
        }
        long end = System.nanoTime();
        return end - start;

    }
}
