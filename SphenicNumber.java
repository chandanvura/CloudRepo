import java.util.Scanner;

public class SphenicNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is divisible by any prime number more than once
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0 && number % (i * i) == 0) {
                System.out.println(number + " is not a sphenic number.");
                return;
            }
        }

        // Check if the number has exactly 8 divisors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        if (count != 8) {
            System.out.println(number + " is not a sphenic number.");
            return;
        }

        // The number is a sphenic number
        System.out.println(number + " is a sphenic number.");
        sc.close();
    }
}

/*
 * int num =30;
 * int x= 0;
 * for(int i =1;i<=num;i++){
 * if(num%i==0){
 *   
 * int count=0;
 *  for(int j =1;j<=i;j++){
 * if(i%j==0){
 * count++;
 * }
 * if(count ==2){
 * prod = prod *i;
 * }
 * }
 * if(prod == num  && x==3){
 * sout("sphenic number ")}
 * else{
 * sou("not a sphenic number ")}
 }
 * }
 */