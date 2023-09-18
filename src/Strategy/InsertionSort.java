package Strategy;

public class InsertionSort implements SortStrategy{
    @Override
    public void sort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            // key를 올바른 위치에 삽입
            array[j + 1] = key;
        }
    }
}
