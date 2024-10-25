import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class InsertionSort implements SortingAlgorithm {

    public void sort(ArrayList<Integer> vector) {
        Integer current = 1;
        for (int j = 1; j < vector.size(); j++) {
            Integer remember = current.intValue();
            for (int i = 1; i < current; i++) {
                if (vector.get(current) < vector.get(current - i)) {
                    Collections.swap(vector, current, current - i);
                    current--;
                    i--;
                }
            }
            current = remember;
            current++;
        }
    }

}
