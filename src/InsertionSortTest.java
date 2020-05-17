import java.util.Random;

public class InsertionSortTest {
    public static void main(String[] args) {
        Random random = new Random();
        int[] list1 = new int[]{6, 5, 4, 1, 3, 2, 7, 8, 10, 9, 0};

        System.out.print("List 1: ");
        for (int value : list1) {
            System.out.print(value + "\t");
        }

        System.out.print("\nList 1 after sort: ");
        InsertionSort.insertionSort(list1);

        int[] list2 = new int[random.nextInt(5)+5];

        for (int i = 0; i < list2.length; i++) {
            list2[i] = random.nextInt(20);
        }
        System.out.print("\n\nList 2: ");
        for (int value : list2) {
            System.out.print(value + "\t");
        }

        System.out.println("\nBegin sort processing...");
        InsertionSort.insertionSortDetail(list2);

    }
}
