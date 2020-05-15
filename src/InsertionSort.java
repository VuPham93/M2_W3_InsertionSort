public class InsertionSort {
    public static void insertionSortDetail(int[] list) {
    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int current = list[i];
            int previousIndex = i - 1;

            if (list[previousIndex] > current) {
                while (previousIndex >= 0) {
                    list[previousIndex+1] = list[previousIndex];
                    previousIndex = previousIndex - 1;
                }
                list[previousIndex + 1] = current;
            }


        }

        for (int element : list) {
            System.out.print(element + "\t");
        }
    }
}
