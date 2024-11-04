public class QuickSort {
 
    public void changePosition(int[] data, int positionOne, int positionTwo){
        int value = data[positionOne];
        data[positionOne] = data[positionTwo];
        data[positionTwo] = value;
    }

    private int partition(int[] data, int start, int end) {
        int pivot = data[end];
        int countMinors = start;

        for(int i = start; i < end; i++){
            if(data[i] <= pivot){
                changePosition(data, countMinors, i);
                countMinors++;
            }
        }
        changePosition(data, countMinors, end);
        return countMinors;
    }

    public long sort(int[] data){
        long start = System.nanoTime();
        quickSort(data, 0, data.length - 1);
        long end = System.nanoTime();
        return end - start;
    }

    private void quickSort(int[] data, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(data, start, end);
            if(pivotIndex == 0){
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

