package Strategy;

public class StrategyMain {
    public static void main(String[] args) {
        int[] number1 = {5, 1, 3, 4, 2};

        Sort sort = new Sort();

        // 버블 정렬을 선택
        sort.setSortingStrategy(new BubbleSort());
        sort.doSort(number1);
        sort.printSortArray(number1);

        int[] number2 = {5, 1, 3, 4, 2};

        // 퀵 정렬을 선택
        sort.setSortingStrategy(new QuickSort());
        sort.doSort(number2);
        sort.printSortArray(number2);

        // 삽입 정렬을 선택
        int[] number3 = {5, 1, 3, 4, 2};

        // 퀵 정렬을 선택
        sort.setSortingStrategy(new InsertionSort());
        sort.doSort(number3);
        sort.printSortArray(number3);
    }
}
