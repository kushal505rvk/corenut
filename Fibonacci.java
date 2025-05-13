package projec2;

public class Fibonacci {
    public static void main(String[] args) {
        int count = 20;
        int first = 1, second = 1;
        int sum = first + second;

        System.out.println("The first 20 Fibonacci numbers are:");
        System.out.print(first + " " + second + " ");

       
        for (int i = 3; i <= count; i++) {
            int next = first + second;
            System.out.print(next + " ");
            sum += next;
            first = second;
            second = next;
        }

        double average = (double) sum / count;
        System.out.printf("\nAverage is: %.2f\n", average);
    }
}
