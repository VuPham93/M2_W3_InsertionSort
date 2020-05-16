public class InsertionSort {
    public static void insertionSortDetail(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int current = list[i];
            System.out.print("Check value at position " + i + ": " + current);
            int previousIndex = i - 1;

            while (previousIndex >= 0 && list[previousIndex] > current) {
                System.out.print(" | smaller than value at position " + previousIndex + ": " + list[previousIndex]);
                list[previousIndex + 1] = list[previousIndex];
                previousIndex--;
            }
            System.out.println(" | Insert " + current + " to position " + (previousIndex + 1));
            list[previousIndex + 1] = current;
        }

        System.out.print("\nList 2 after sort: ");
        for (int element : list) {
            System.out.print(element + "\t");
        }
    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int current = list[i];
            int previousIndex = i - 1;

            while (previousIndex >= 0 && list[previousIndex] > current) {
                list[previousIndex + 1] = list[previousIndex];
                previousIndex--;
            }
            list[previousIndex + 1] = current;
        }

        for (int element : list) {
            System.out.print(element + "\t");
        }
    }
}
