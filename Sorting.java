package projec2;

public class Sorting {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7, 4};

        // Sort in Ascending Order
        int[] ascending = numbers.clone();
        for (int i = 0; i < ascending.length - 1; i++) {
            for (int j = 0; j < ascending.length - 1 - i; j++) {
                if (ascending[j] > ascending[j + 1]) {
                    int temp = ascending[j];
                    ascending[j] = ascending[j + 1];
                    ascending[j + 1] = temp;
                }
            }
        }

        // Sort in Descending Order
        int[] descending = numbers.clone();
        for (int i = 0; i < descending.length - 1; i++) {
            for (int j = 0; j < descending.length - 1 - i; j++) {
                if (descending[j] < descending[j + 1]) {
                    int temp = descending[j];
                    descending[j] = descending[j + 1];
                    descending[j + 1] = temp;
                }
            }
        }

        // Print results
        System.out.print("Ascending Order: ");
        for (int num : ascending) {
            System.out.print(num + " ");
        }

        System.out.print("\nDescending Order: ");
        for (int num : descending) {
            System.out.print(num + " ");
        }
    }
}
