import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort implements SortingAlgorithm {

    public long sort(ArrayList<Integer> vector) {
        long start = System.nanoTime();
        
        for (int i = 0; i < vector.size() - 1; i++) {
            for (int j = 0; j < vector.size() - 1 - i; j++) {
                if (vector.get(j) > vector.get(j + 1)) {
                    Collections.swap(vector, j, j + 1);
                }
            }
        }

        long end = System.nanoTime();
        return end - start;
    }
}