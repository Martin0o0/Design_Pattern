package Strategy;

import java.util.Arrays;

public class Sort {
    private SortStrategy sortStrategy;

    public void setSortingStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void doSort(int[] array) {
        if (sortStrategy != null) {
            sortStrategy.sort(array);
        } else {
            System.out.println("정렬 알고리즘이 지정되지 않았습니다.");
        }
    }

    public void printSortArray(int[] array){
        System.out.println(Arrays.toString(array));
    }
}
