public class InsertionSort {
    static int[] list = {12, 2, 8, 5, 7, 6, 4, 15};

    public static void insertionSort(int[] list) {
        int pos, x;
        for (int i = 1; i < list.length; i++) {
            x = list[i];
            pos = i;
            while (pos > 0 && x < list[pos - 1]) {
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = x;
        }
    }

    public static void main(String[] args) {
        System.out.println("Mảng ban đầu!");
        for (int i = 0;i<list.length;i++){
            System.out.print(list[i] + " ");
        }
        insertionSort(list);
        System.out.println("\nInsertion sorting.....");
        for (int j = 0; j < list.length; j++)
            System.out.print(list[j] + " ");
    }
}
