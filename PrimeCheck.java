package projec1;

public class PrimeCheck {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;  // Numbers less than or equal to 1 are not prime.
        }
        if (n == 2) {
            return true;  // 2 is the only even prime number.
        }
        if (n % 2 == 0) {
            return false;  // All other even numbers are not prime.
        }
        for (int i = 3; i * i <= n; i += 2) {  // Check odd divisors up to √n.
            if (n % i == 0) {
                return false;  // If divisible, it's not prime.
            }
        }
        return true;  // If no divisors found, it's prime.
    }

    public static void main(String[] args) {
        System.out.println(isPrime(1));  
        System.out.println(isPrime(3));
       
    }
}

