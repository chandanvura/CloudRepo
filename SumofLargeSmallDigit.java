
// wap to find sum of largest number and smallestdigit is prime or not 
import java.util.Scanner;

public class SumofLargeSmallDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int LargestNum = num % 10;
        //use temp value to find largest and smallest 
        int temp = num;

        while (temp != 0) {
            int ld = temp % 10;
            if (ld > LargestNum) {
                LargestNum = ld;
            }
            //or else we can use if(ld<smallest){
            //  smallest =ld}
            //}

            temp = temp / 10;

        }
        temp = num;
        int smallestdigit = num % 10;
        while (temp != 0) {
            int ld = temp % 10;
            if (ld < smallestdigit) {
                smallestdigit = ld;
            }

            temp = temp / 10;
        }
        // sum of largest and smallest number 
        int sum2 = LargestNum + smallestdigit;
        System.out.println(sum2);
        boolean isPrime = true;
        if (sum2 <= 1) {
            isPrime = false;

        } else {
            for (int i = 2; i <= sum2 / 2; i++) {
                if (sum2 % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
        sc.close();
    }

}
//factor of a given number
/*
 * int count =0;
 * for(int i = 1;i<=sum2;i++){
 * if(sum%i==0){
 * count++;
 * }
 * }
 * if(count==2){
 * sout("prime")}
 * else{
 * sout("not prime ")}
 */