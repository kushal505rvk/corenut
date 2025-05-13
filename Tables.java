package projec2;

public class Tables {
    public static void main(String[] args) {
        int size = 9;
        System.out.print("* |");
        for (int i = 1; i <= size; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        System.out.println("-------------------------------");
        for (int i = 1; i <= size; i++) {
            System.out.print(i + " |");
            for (int j = 1; j <= size; j++) {
                System.out.print(" " + (i * j));
            }
            System.out.println();
        }
    }
}

