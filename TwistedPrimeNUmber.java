import java.util.Scanner;;

public class TwistedPrimeNUmber {
    // write a method to return true is prime else false 

    public static boolean  isPrime(int x) {

        int count = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }

    }

    public static int   Reversed(int x) {
        int rev = 0;
        while (x != 0) {
            rev = rev * 10 + (x % 10);
            x /= 10;
        }
        return rev;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre a number ");
        int num = sc.nextInt();

        if (isPrime(num)) {   //prime number check using methods above
            int rev = Reversed(num); // prime number we reversed 
            if(isPrime(rev))   // rev the prime checking whether its again prime or not 
            {
                System.out.println(num + " is twisted prime number ");
            }
            else {
                System.out.println(num+" is prime but not twsited prime ");
            }
        }
        else {
            System.out.println("Number is not a prime number ");
        }
        sc.close();
        
    }
    
}
