import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort implements SortingAlgorithm {

    public long sort(ArrayList<Integer> vector) {
        long start = System.nanoTime();

        boolean swapped;
        for (int i = 0; i < vector.size() - 1; i++) {
            swapped = false;
            for (int j = 0; j < vector.size() - i - 1; j++) {
                if (vector.get(j) > vector.get(j + 1)) {
                    Collections.swap(vector, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        long end = System.nanoTime();
        return end - start;
    }
}
