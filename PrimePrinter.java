package projec1;

public class PrimePrinter {
    public static void main(String[] args) {
        int count = 0;         // How many primes we've found
        int num = 2;           // Start checking from 2

        while (count < 30) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
