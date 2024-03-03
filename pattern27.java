public class pattern27 {

    public static void main(String[] args) {
        int space = 4;
        int primeCount = 0;
        int num = 2; // Starting from 2, the first prime number

        while (primeCount < 25) {
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i * i <= num; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                primeCount++;

                for (int a = 1; a <= space; a++) {
                    System.out.print(" ");
                }

                System.out.print(num); // Print the prime number instead of stars
                System.out.println();

                space--;
            }

            num++;
        }
    }
}
