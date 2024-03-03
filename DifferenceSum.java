public class DifferenceSum {
    public static void main(String[] args) {
        // Example usage:
        int m = 6;
        int n = 30;
        int sumDivisibleByM = 0;
        int sumNotDivisibleByM = 0;
        
        // Calculating sum of integers divisible and not divisible by m
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                sumDivisibleByM += i;
            } else {
                sumNotDivisibleByM += i;
            }
        }
        
        // Calculating the difference
        int difference = sumNotDivisibleByM - sumDivisibleByM;
        System.out.println(difference);  // Output: 285

        // Sample input
        m = 3;
        n = 10;
        sumDivisibleByM = 0;
        sumNotDivisibleByM = 0;

        // Calculating sum of integers divisible and not divisible by m
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                sumDivisibleByM += i;
            } else {
                sumNotDivisibleByM += i;
            }
        }
        
        // Calculating the difference
        difference = sumNotDivisibleByM - sumDivisibleByM;
        System.out.println(difference);  // Output: 19
    }
}
