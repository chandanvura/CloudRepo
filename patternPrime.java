public class patternPrime{

    public static void main(String[] args) {
        int n = 5; // Number of rows to print
        int currentNum = 11; // Starting number

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                while (!isPrime(currentNum)) {
                    currentNum++;
                }
                System.out.print(currentNum++ + " ");
            }
            System.out.println();
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
