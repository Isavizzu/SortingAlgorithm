import java.util.ArrayList;

import static java.util.Collections.swap;

public class QuickSort implements SortingAlgorithm{

    private int partition(ArrayList<Integer> data, int start, int end) {
        int pivot = data.get(end);
        int countMinors = start;

        for(int i = start; i < end; i++){
            if(data.get(i) <= pivot){
                swap(data, countMinors, i);
                countMinors++;
            }
        }
        swap(data, countMinors, end);
        return countMinors;
    }


    public long sort(ArrayList<Integer> data){
        long start = System.nanoTime();
        quickSort(data, 0, data.size() - 1);
        long end = System.nanoTime();
        return end - start;
    }


    private void quickSort(ArrayList<Integer> data, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(data, start, end);
            if(pivotIndex == start){
                quickSort(data, pivotIndex + 1, end);
            }
            else if(pivotIndex == end){
                quickSort(data, start, pivotIndex - 1);
            }
            else{
                quickSort(data, start, pivotIndex - 1);
                quickSort(data, pivotIndex + 1, end);
            }
            
        }
    }

}

